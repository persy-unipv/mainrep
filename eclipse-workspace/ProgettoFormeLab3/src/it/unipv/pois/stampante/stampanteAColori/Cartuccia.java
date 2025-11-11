package it.unipv.pois.stampante.stampanteAColori;

import it.unipv.pois.stampante.colore.ColoreRGB;

public class Cartuccia {
	private ColoreRGB colore;
	private double carica;
	
	public Cartuccia(ColoreRGB colore, double carica) {
		super();
		this.setColore(colore);
		this.carica = checkRange(carica);
	}
	
	public Cartuccia(ColoreRGB colore) {
		super();
		this.setColore(colore);
		this.carica = 100;
	}

	private double checkRange(double carica){
		if(carica>100) {
			return 100;
		}else if(carica<0) {
			return 0;
		}else {
			return carica;
		}
	}
	
	public double getCarica() {
		return carica;
	}

	public void setCarica(double carica) {
		this.carica = checkRange(carica);
	}

	public ColoreRGB getColore() {
		return colore;
	}

	public void setColore(ColoreRGB colore) {
		this.colore = colore;
	}
	
	public boolean consumaCarica(double consumo) {
		carica -= consumo;
		carica = checkRange(carica);
		if (carica==0) {
			return false;
		}else {
			return true;
		}
	}
	
	
	

}
