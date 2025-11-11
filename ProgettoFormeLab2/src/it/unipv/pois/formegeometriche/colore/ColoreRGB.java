package it.unipv.pois.formegeometriche.colore;

public class ColoreRGB {
	
	private int r;
	private int g;
	private int b;
	
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = checkRange(r);
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = checkRange(g);
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = checkRange(b);
	}
	public void setColoriDefault(Colore c) {
		switch(c) {

		case ROSSO:
			r=255;
			g=0;
			b=0;
			break;

		case VERDE:
			r=0;
			g=255;
			b=0;
			break;
		
		case BLU:
			r=0;
			g=0;
			b=255;
			break;
	

		}
		
	}
	
	
	
	
	public ColoreRGB() {
		super();
	}
	public ColoreRGB(int r, int g, int b) {
		this.r = checkRange(r);
		this.g = checkRange(g);
		this.b = checkRange(b);
	}
	
	private int checkRange(int val) {
		int valoreCorretto = 0;
		if(val<0) {
			valoreCorretto = 0;
		}else if(val>255){
			valoreCorretto = 255;
		}
		
		return valoreCorretto;
	}
	
}
