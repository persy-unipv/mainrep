package it.unipv.pois.stampante.immagine.vettoriale.formeGeometriche;

import it.unipv.pois.stampante.colore.ColoreRGB;

public class Cerchio extends Forma {
	private double raggio;

	public Cerchio(ColoreRGB colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}


	public double getRaggio() {
		return raggio;
	}


	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}


	@Override
	public double getArea() {
		double area = Math.PI * raggio * raggio;
		return area;
	}

	@Override
	public double getPerimetro() {
		double perimetro = 2 * raggio * Math.PI;
		return perimetro;
	}

}
