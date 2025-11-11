package it.unipv.pois.formegeometriche.forme;

import it.unipv.pois.formegeometriche.colore.ColoreRGB;

public class Rettangolo extends Forma {
	
	private double base; 
	private double altezza; 
	
	

	public Rettangolo(ColoreRGB c) {
		super(c);
		base = 0;
		altezza = 0;
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
		// TODO Auto-generated method stub
		double area;
		area = base * altezza;		
		return area;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double perimetro;
		
		perimetro = (base + altezza)*2;
		
		return perimetro;
	}

}
