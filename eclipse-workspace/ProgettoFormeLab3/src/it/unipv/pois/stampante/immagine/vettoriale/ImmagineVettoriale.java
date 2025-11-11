package it.unipv.pois.stampante.immagine.vettoriale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import it.unipv.pois.stampante.colore.Colore;
import it.unipv.pois.stampante.colore.ColoreRGB;
import it.unipv.pois.stampante.immagine.Stampabile;
import it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche.Forma;

public class ImmagineVettoriale implements Stampabile {
	private List<Forma> forme = new ArrayList<>();

	public List<Forma> getForme() {
		return forme;
	}

	public void setForme(List<Forma> forme) {
		this.forme = forme;
	}

	public boolean aggiungiForma(Forma f) {
		boolean ret = forme.add(f);
		if(ret) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean rimuoviForma(Forma f, int posizione) {
		if(posizione>forme.size()) {
			System.out.println("Impossibile rimuovere forma in posizione "+posizione+". Numero forme presenti: "+forme.size());
			return false;
		}else if(posizione<0) {
			System.out.println("Errore: la posizione può essere solo positiva");
			return false;
		}else {
			forme.remove(posizione-1);
			return true;
		}
		
	}
	
	@Override
	public HashMap<Colore, Double>  getInchiostroRichiesto() {
		// TODO Auto-generated method stub
		HashMap<Colore, Double> inchiostro_richiesto = new HashMap<Colore, Double>();
		double[] consumo = new double[3];
		for(double con : consumo) {
			con = 0;
		}
		ColoreRGB colore_forma;
		for(Forma f : forme) {
			colore_forma = f.getColore();
			consumo[0] += colore_forma.getR()/255*f.getArea()*Stampabile.GAMMA;
			consumo[1] += colore_forma.getG()/255*f.getArea()*Stampabile.GAMMA;
			consumo[2] += colore_forma.getB()/255*f.getArea()*Stampabile.GAMMA;
		}
		inchiostro_richiesto.put(Colore.ROSSO, consumo[0]);
		inchiostro_richiesto.put(Colore.VERDE, consumo[1]);
		inchiostro_richiesto.put(Colore.BLU, consumo[2]);
		return inchiostro_richiesto;
	}

}
