package it.unipv.pois.formegeometriche.stampa;

import it.unipv.pois.formegeometriche.colore.ColoreRGB;

public class Cartuccia {
	
	private ColoreRGB c; 
	private double carica;
	
	public Cartuccia(ColoreRGB c, double carica) {
		super();
		this.c = c;
		this.carica = carica;
	}
	public ColoreRGB getC() {
		return c;
	}
	public void setC(ColoreRGB c) {
		this.c = c;
		this.carica = 100; 
	}
	public double getCarica() {
		return carica;
	}
	public void setCarica(double carica) {
		this.carica = carica;
	} 
	
	
	public void getConsumo(double r,double g,double b ) {
		
		
		
	}
	
//	//inizializzare la carica 
//	
////	public void getConsumo(Immagine imm){
////		Forma [] forme = imm.getForme();
////		double rossoNorm;
////		double blueNorm;
////		double verdeNorm;
////		
////		
////		for(int i=0; i<imm.getIndice();i++) {
////			ColoreRGB c = forme[i].getC();
////			rossoNorm= (c.getR()/255)*100;
////			verdeNorm=(c.getG()/255)*100;
////			blueNorm=(c.getB()/255)*100;
////			
////			carica -= forme[i].getArea()*(rossoNorm+blueNorm+verdeNorm);
////			
////			
////		}
//		
//	}
	
	

}
