package it.unipv.pois.formegeometriche.forme;

import it.unipv.pois.formegeometriche.colore.ColoreRGB;

public class Quadrato extends Forma {
	
	private double lato; 
	
	

	

	public Quadrato(ColoreRGB c, double lato) {
		super(c);
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
		double area;
		area = lato*lato;
		// TODO Auto-generated method stub
		return area;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double perimetro;
		
		perimetro = 4*lato; 
		return perimetro;
	}

}
