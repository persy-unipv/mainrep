package it.unipv.pois.formegeometriche.forme;

public class Rettangolo {
	private double base,altezza;

	public Rettangolo() {
		
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


	void scambia() {
		
		double temp;
		temp= base;
		base=altezza; 
		altezza = temp;
		
	}
	double calcDiagonale() {
		
		double diagonale; 
		diagonale = Math.sqrt(Math.pow(base,2 ) + Math.pow(altezza, 2));
		
		return diagonale; 
		
	}
	
	Rettangolo instaziaOggetto() {
		Rettangolo r = new Rettangolo();
		r.scambia();
		return r; 
		
	}
	
	public static void main(String[] args) {
			
	}

}
