package it.unipv.pois.formegeometriche.forme;

public class Quadrato {
	private double lato;
	
	
	
	public Quadrato(double lato) {
		this.lato = lato;
	}


	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}


	double calcDiagonale() {
			
			double diagonale; 
			diagonale = lato*(Math.sqrt(2));
		
			return diagonale; 
			
		}
	Cerchio createCerchioInscritto() {
		
		return new Cerchio(lato/2);
	}
	
	Cerchio createCerchioCircoscritto() {
		double diagonale;
		diagonale = calcDiagonale();
		
		
		return new Cerchio(diagonale/2);
	}
	
	
}
