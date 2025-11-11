package it.unipv.pois.formegeometriche.stampa;
import it.unipv.pois.formegeometriche.forme.*;

public class Immagine {
	private Forma [] forme;
	private int indice; 
	private final int MAX_NUM_FORME = 100;
	
	public Immagine(Forma[] f) {
		super();
		indice = 0; 		
		this.forme = new Forma[MAX_NUM_FORME];
	}

	public Immagine(Forma[] forme, int indice) {
		super();
		this.forme = forme;
		this.indice = indice;
	}

	public Forma[] getForme() {
		return forme;
	}

	public void setForme(Forma[] forme) {
		this.forme = forme;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getMAX_NUM_FORME() {
		return MAX_NUM_FORME;
	}

	
	
	public boolean aggiungiForma(Forma f) {
		if(indice<MAX_NUM_FORME) {
			forme[indice]=f;
			indice++;
			System.out.println("aggiunta una nuova forma");
			return true; 
			
		}else {
			System.out.println("Spiacenti non è stato possibile aggiungere nulla");
			return false; 
			
		}
		
		
	}
	
	
	

}
