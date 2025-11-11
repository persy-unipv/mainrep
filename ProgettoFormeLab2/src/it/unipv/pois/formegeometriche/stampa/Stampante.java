package it.unipv.pois.formegeometriche.stampa;

import it.unipv.pois.formegeometriche.colore.Colore;
import it.unipv.pois.formegeometriche.colore.ColoreRGB;
import it.unipv.pois.formegeometriche.forme.Forma;

public class Stampante {
	
	private Cartuccia [] c;
	private final int NUMERO_CARTUCCE=3;
	private int indice; 
	

	public Stampante(Cartuccia[] c) {
		super();
		this.c = new Cartuccia[NUMERO_CARTUCCE];
	}
	
	
	

	public Stampante(double carica) {
		ColoreRGB color  = new ColoreRGB();
		color.setColoriDefault(Colore.ROSSO);
		c[0] = new Cartuccia(color,100);
		color.setColoriDefault(Colore.VERDE);
		c[1] = new Cartuccia(color,100);
		color.setColoriDefault(Colore.BLU);
		c[2]  = new Cartuccia(color,100);
		
	}

	public Cartuccia[] getC() {
		return c;
	}

	public void setC(Cartuccia[] c) {
		this.c = c;
	} 
	
	
//	public void inizializzaCartucce(double carica) { 
//		Stampante s = new Stampante(carica);	
//	}
	 
	public void changeCartuccia(Cartuccia cartuccia,int posizione) {
		c[posizione] = cartuccia; 
		
	}
	
	public void getLivello(){
		for(int i=0;i<c.length;i++) {
			c[i].getCarica();
		}
	}
	
	public void printImmagine(Immagine imm) {
	    Forma[] forme = imm.getForme();
	    ColoreRGB colore;
	    double rossoTot = 0;
	    double verdeTot = 0;
	    double bluTot = 0;
	    double area;

	    for (Forma f : forme) {
	        colore = f.getC(); 
	        area = f.getArea();

	        rossoTot += (colore.getR() / 255.0) * area;
	        verdeTot += (colore.getG() / 255.0) * area;
	        bluTot += (colore.getB() / 255.0) * area;
	    }

	    boolean mancaRosso = checkLvlInk(rossoTot);
	    boolean mancaVerde = checkLvlInk(verdeTot);
	    boolean mancaBlu = checkLvlInk(bluTot);

	    if (!mancaRosso) {
	        c[0].setCarica(c[0].getCarica() - rossoTot);
	    } else {
	        System.out.println("Non ho più rosso");
	    }

	    if (!mancaVerde) {
	        c[1].setCarica(c[1].getCarica() - verdeTot);
	    } else {
	        System.out.println("Non ho più verde");
	    }

	    if (!mancaBlu) {
	        c[2].setCarica(c[2].getCarica() - bluTot);
	    } else {
	        System.out.println("Non ho più blu");
	    }
	}
	public boolean checkLvlInk(double carica_da_rimuovere) {
		boolean check = false;
		int posizione=0; 
		for(int i=0;i<c.length;i++){
			if((c[i].getCarica()-carica_da_rimuovere)<0) {
				posizione = i; 
				check = false;
			}else {
				check=true;
			}
		}
		return check;
	}
		
		
}
	//Metodo di aggiunta cartuccia usando firma diversa di change cartuccia ma usando un indice 
	
	
	
	


