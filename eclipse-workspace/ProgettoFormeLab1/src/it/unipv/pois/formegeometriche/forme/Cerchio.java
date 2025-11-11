package it.unipv.pois.formegeometriche.forme;

public class Cerchio {
	
	private double raggio;

	public Cerchio(double raggio) {
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	} 
	
	Quadrato createNewQuadrato() {
		
		
		double lato;
		lato= raggio*(Math.sqrt(2));
		
		return new Quadrato(lato);
	}
	
}
