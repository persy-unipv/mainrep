package it.unipv.pois.stampante.stampanteAColori;

import java.util.EnumSet;
import java.util.HashMap;

import it.unipv.pois.stampante.colore.Colore;
import it.unipv.pois.stampante.colore.ColoreRGB;
import it.unipv.pois.stampante.immagine.Stampabile;
import it.unipv.pois.stampante.immagine.raster.ImmagineRaster;
import it.unipv.pois.stampante.immagine.vettoriale.ImmagineVettoriale;
import it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche.Cerchio;
import it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche.Quadrato;
import it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche.Rettangolo;

public class Stampante {
	private HashMap<Colore, Cartuccia> cartucce;
	final static private EnumSet<Colore> COLORI_SUPPORTATI = EnumSet.of(Colore.ROSSO, Colore.VERDE, Colore.BLU);

	public Stampante(HashMap<Colore, Cartuccia> cartucce) {
		super();
		this.cartucce = cartucce;
	}

	public Stampante(Cartuccia rosso, Cartuccia verde, Cartuccia blu) {
		super();
		this.cartucce = new HashMap<Colore, Cartuccia>();
		this.cartucce.put(Colore.ROSSO, rosso);
		this.cartucce.put(Colore.VERDE, verde);
		this.cartucce.put(Colore.BLU, blu);
	}

	public HashMap<Colore, Cartuccia> getCartucce() {
		return cartucce;
	}

	public void setCartucce(HashMap<Colore, Cartuccia> cartucce) {
		this.cartucce = cartucce;
	}

	public static EnumSet<Colore> getColoriSupportati() {
		return COLORI_SUPPORTATI;
	}

	public boolean cambiaCartuccia(Cartuccia cart, Colore col) {
		if(!COLORI_SUPPORTATI.contains(col)) {
			System.out.println("Errore: "+col+" non è un colore supportato dalla stampante. Inserire un colore valido (ROSSO, VERDE, BLU)");
			return false;
		}else {
			cartucce.replace(col, cart);
			return true;
		}		
	}

	public double getLivelloCartuccia(Colore col) {
		if(!COLORI_SUPPORTATI.contains(col)) {
			System.out.println("Errore: "+col+" non è un colore supportato dalla stampante. Inserire un colore valido (ROSSO, VERDE, BLU)");
			return -1;
		}else {
			double carica_cartuccia = cartucce.get(col).getCarica();
			System.out.println("Livello cartuccia "+col+": "+String.format("%.2f",carica_cartuccia)+" %");
			return carica_cartuccia;
		}
	}

	public void mostraLivelloCartucce() {
		for(Colore col : cartucce.keySet()) {
			System.out.println("Cartuccia: "+col+"\tLivello: "+String.format("%.2f", cartucce.get(col).getCarica())+" %") ;
		}
	}


	public boolean stampa(Stampabile immagine) {
		HashMap<Colore, Double>  consumo_inchiostro = immagine.getInchiostroRichiesto();
		boolean stato_stampa = true;
		double carica_t = 0;
		Cartuccia cart_t;
		for (Colore colore_cart : cartucce.keySet()) {
			cart_t = cartucce.get(colore_cart);
			System.out.println("\n\nCarica cartuccia "+cart_t.getColore()+" prima di cancellare: "+String.format("%.2f",cart_t.getCarica())+"\t\tConsumo inchiostro: "+String.format("%.2f",consumo_inchiostro.get(colore_cart)));
			carica_t = cart_t.getCarica() - consumo_inchiostro.get(colore_cart);
			if(carica_t<0) {
				System.out.println("Inchiostro "+colore_cart+" insufficiente\n\n");
				stato_stampa = false;
			}
		}

		if(stato_stampa) {
			for (Colore colore_cart : cartucce.keySet()) {
				cart_t = cartucce.get(colore_cart);
				cart_t.setCarica(cart_t.getCarica() - consumo_inchiostro.get(colore_cart));
				//cartucce.replace(colore_cart, cart_t);
			}
			return true;
		}else {
			return false;
		}
	}













	public static void main(String[] args) {


		ColoreRGB rosso = new ColoreRGB(Colore.ROSSO);
		ColoreRGB verde = new ColoreRGB(Colore.VERDE);
		ColoreRGB blu = new ColoreRGB(Colore.BLU);
		ColoreRGB giallo = new ColoreRGB(Colore.GIALLO);
		ColoreRGB viola = new ColoreRGB(Colore.VIOLA);
		ColoreRGB rosa = new ColoreRGB(Colore.ROSA);
		ColoreRGB arancio = new ColoreRGB(Colore.ARANCIO);
		ColoreRGB nero = new ColoreRGB(Colore.NERO);
		ColoreRGB bianco = new ColoreRGB(Colore.BIANCO);
		ColoreRGB azzurro = new ColoreRGB(Colore.AZZURRO);
		ColoreRGB grigio = new ColoreRGB(Colore.GRIGIO);


		Cartuccia[] cart = new Cartuccia[3];
		cart[0] = new Cartuccia(rosso);
		cart[1] = new Cartuccia(verde);
		cart[2] = new Cartuccia(blu);

		Stampante HPDeskjet = new Stampante(cart[0], cart[1], cart[2]);

		Rettangolo r1 = new Rettangolo(viola, 5, 2);
		Rettangolo r2 = new Rettangolo(azzurro, 6, 1.5);
		Rettangolo r3 = new Rettangolo(giallo, 3, 7);
		Cerchio c1 = new Cerchio(grigio, 3);
		Cerchio c2 = new Cerchio(nero, 2);
		Quadrato q1 = new Quadrato(verde, 2);
		Quadrato q2 = new Quadrato(rosso, 4);
		Quadrato q3 = new Quadrato(arancio, 2.5);

		ImmagineVettoriale cad_image = new ImmagineVettoriale();
		cad_image.aggiungiForma(r1);
		cad_image.aggiungiForma(r2);
		cad_image.aggiungiForma(r3);
		cad_image.aggiungiForma(c1);
		cad_image.aggiungiForma(c2);
		cad_image.aggiungiForma(q1);
		cad_image.aggiungiForma(q2);
		cad_image.aggiungiForma(q3);

		System.out.println("Numero forme che compongono l'immagine: "+cad_image.getForme().size());
		
		ImmagineRaster jpg = new ImmagineRaster(4, 3);
		jpg.setPixelImmagine(nero, 0, 0);
		jpg.setPixelImmagine(azzurro, 1, 0);
		jpg.setPixelImmagine(rosa, 3, 0);
		jpg.setPixelImmagine(giallo, 2, 3);
		jpg.setPixelImmagine(verde, 4, 3);
		jpg.setPixelImmagine(viola, 2, 2);
		
		
		
		
		boolean risultato_stampa = HPDeskjet.stampa(cad_image);
		HPDeskjet.mostraLivelloCartucce();
		
		if(risultato_stampa) {
			System.out.println("Stampa riuscita!");
		}else {
			System.out.println("Stampa fallita! Inchiostro insufficiente");
		}

		risultato_stampa = HPDeskjet.stampa(jpg);
		HPDeskjet.mostraLivelloCartucce();
		
		if(risultato_stampa) {
			System.out.println("Stampa riuscita!");
		}else {
			System.out.println("Stampa fallita! Inchiostro insufficiente");
		}
	}













}
