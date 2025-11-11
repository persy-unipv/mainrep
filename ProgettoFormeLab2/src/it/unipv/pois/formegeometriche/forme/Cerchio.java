package it.unipv.pois.formegeometriche.forme;

import it.unipv.pois.formegeometriche.colore.ColoreRGB;

public class Cerchio extends Forma {
	
	private double raggio; 
	
	
	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public Cerchio(ColoreRGB c, double raggio) {
		super(c);
		this.raggio = raggio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area; 
		area = Math.PI*(raggio*raggio);
		
		return area;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double perimetro; 
		perimetro = 2*Math.PI*raggio;
		return perimetro;
	}

}
