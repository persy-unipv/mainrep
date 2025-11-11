package it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche;

import it.unipv.pois.stampante.colore.ColoreRGB;

public class Rettangolo extends Forma {
	private double base, altezza;

	public Rettangolo(ColoreRGB colore, double base, double altezza) {
		super(colore);
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}



	@Override
	public double getArea() {
		double area = base * altezza;
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro = base * 2 + altezza * 2;
		return perimetro;
	}

}
