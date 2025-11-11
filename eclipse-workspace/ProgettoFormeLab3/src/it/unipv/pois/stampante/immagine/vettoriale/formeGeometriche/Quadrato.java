package it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche;

import it.unipv.pois.stampante.colore.ColoreRGB;

public class Quadrato extends Forma {
private double lato;
	
	public Quadrato(ColoreRGB colore, double lato) {
		super(colore);
		this.lato = lato;
	}

	
	
	public double getLato() {
		return lato;
	}



	public void setLato(double lato) {
		this.lato = lato;
	}



	@Override
	public double getArea() {
		double area = lato * lato;
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro = lato * 4;
		return perimetro;
	}

}
