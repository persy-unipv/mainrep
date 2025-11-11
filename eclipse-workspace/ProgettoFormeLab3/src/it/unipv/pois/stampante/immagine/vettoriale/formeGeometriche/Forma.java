package it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche;

import it.unipv.pois.stampante.colore.ColoreRGB;

public abstract class Forma {
	private ColoreRGB colore;
		
	public Forma(ColoreRGB colore) {
		super();
		this.colore = colore;
	}

	public ColoreRGB getColore() {
		return colore;
	}

	public void setColore(ColoreRGB colore) {
		this.colore = colore;
	}

	public abstract double getArea();
	
	public abstract double getPerimetro();
	
}
