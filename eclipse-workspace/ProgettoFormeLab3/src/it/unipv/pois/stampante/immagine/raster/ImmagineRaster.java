package it.unipv.pois.stampante.immagine.raster;

import java.util.HashMap;

import it.unipv.pois.stampante.colore.Colore;
import it.unipv.pois.stampante.colore.ColoreRGB;
import it.unipv.pois.stampante.immagine.Stampabile;

public class ImmagineRaster implements Stampabile {
	private Pixel[][] pixels;
	private int altezza;
	private int larghezza;
	final private double COEFF_STAMPA_PIXEL = 0.01;
	
	
	public ImmagineRaster(int larghezza, int altezza) {
		super();
		this.pixels = new Pixel[larghezza][altezza];
		ColoreRGB blank = new ColoreRGB(Colore.BIANCO);
		for(int i=0; i<larghezza; i++) {
			for(int j=0; j<altezza; j++) {
				pixels[i][j] = new Pixel(blank);
			}
		}
		this.larghezza=larghezza;
		this.altezza=altezza;
	}
	
	
	public int getAltezza() {
		return altezza;
	}


	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}


	public int getLarghezza() {
		return larghezza;
	}


	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}


	public Pixel[][] getPixels() {
		return pixels;
	}


	public void setPixels(Pixel[][] pixels) {
		this.pixels = pixels;
	}
	

	private boolean checkDim(int val, int max) {
		if(val>max) {
			System.out.println("Valore inserito non valido. Valore massimo possibile: "+max);
			return false;
		}else if(val<0) {
			System.out.println("Valore di altezza non può essere negativo");
			return false;
		}else {
			return true;
		}
	}
	
	public boolean setPixelImmagine(Pixel p, int x, int y) {
		boolean controllo_posizione;
		controllo_posizione = checkDim(x-1, larghezza);
		controllo_posizione = checkDim(y-1, altezza);
		if(!controllo_posizione) {
			return false;
		}else{
			pixels[x-1][y-1] = p;
			return true;
		}
	}
	
	public boolean setPixelImmagine(ColoreRGB c, int x, int y) {
		boolean controllo_posizione;
		controllo_posizione = checkDim(x-1, larghezza);
		controllo_posizione = checkDim(y-1, altezza);
		if(!controllo_posizione) {
			return false;
		}else{
			Pixel p = new Pixel(c);
			pixels[x-1][y-1] = p;
			return true;
		}
	}

	@Override
	public HashMap<Colore, Double> getInchiostroRichiesto() {
		HashMap<Colore, Double> inchiostro_richiesto = new HashMap<Colore, Double>();
		double[] consumo = new double[3];
		for(double con : consumo) {
			con = 0;
		}
		ColoreRGB colore_pixel;
		for(int i=0; i<larghezza; i++) {
			for(int j=0; j<altezza; j++) {
				colore_pixel = pixels[i][j].getColore();
				consumo[0] += colore_pixel.getR()*COEFF_STAMPA_PIXEL*Stampabile.GAMMA;
				consumo[1] += colore_pixel.getG()*COEFF_STAMPA_PIXEL*Stampabile.GAMMA;
				consumo[2] += colore_pixel.getB()*COEFF_STAMPA_PIXEL*Stampabile.GAMMA;
			}
		}
		inchiostro_richiesto.put(Colore.ROSSO, consumo[0]);
		inchiostro_richiesto.put(Colore.VERDE, consumo[1]);
		inchiostro_richiesto.put(Colore.BLU, consumo[2]);
		return inchiostro_richiesto;
	}

}
