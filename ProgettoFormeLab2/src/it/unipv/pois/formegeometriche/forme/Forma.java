package it.unipv.pois.formegeometriche.forme;
import it.unipv.pois.formegeometriche.colore.*;

public abstract class Forma {
	private ColoreRGB c;
	
	
	public Forma(ColoreRGB c) {
		super();
		this.c = c;
	}
	

	public ColoreRGB getC() {
		return c;
	}

	public void setC(ColoreRGB c) {
		this.c = c;
	}

	public abstract double getArea();
	public abstract double getPerimetro();
	
	


	

}
