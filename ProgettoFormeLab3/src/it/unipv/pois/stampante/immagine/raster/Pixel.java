package it.unipv.pois.stampante.immagine.raster;

import it.unipv.pois.stampante.colore.ColoreRGB;

public class Pixel {
	private ColoreRGB colore;

	public Pixel(ColoreRGB colore) {
		super();
		this.colore = colore;
	}

	public ColoreRGB getColore() {
		return colore;
	}

	public void setColore(ColoreRGB colore) {
		this.colore = colore;
	}
	
}
