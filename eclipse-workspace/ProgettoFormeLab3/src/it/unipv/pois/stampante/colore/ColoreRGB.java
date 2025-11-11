package it.unipv.pois.stampante.colore;

public class ColoreRGB {
	private int R;
	private int G;
	private int B;
	
	public ColoreRGB(int r, int g, int b) {
		this.R = checkRange(r);
		this.G = checkRange(g);
		this.B = checkRange(b);
	}
	
	public ColoreRGB(Colore enumColore) {
		switch(enumColore) {
			case ROSSO:
				this.R = 255;
				this.G = 0;
				this.B = 0;
				break;
			case VERDE:
				this.R = 0;
				this.G = 255;
				this.B = 0;
				break;
			case BLU:
				this.R = 0;
				this.G = 0;
				this.B = 255;
				break;
			case ARANCIO:
				this.R = 255;
				this.G = 127;
				this.B = 0;
				break;
			case GIALLO:
				this.R = 255;
				this.G = 255;
				this.B = 0;
				break;
			case ROSA:
				this.R = 255;
				this.G = 0;
				this.B = 255;
				break;
			case VIOLA:
				this.R = 127;
				this.G = 0;
				this.B = 255;
				break;
			case AZZURRO:
				this.R = 0;
				this.G = 255;
				this.B = 255;
				break;
			case GRIGIO:
				this.R = 127;
				this.G = 127;
				this.B = 127;
				break;
			case BIANCO:
				this.R = 255;
				this.G = 255;
				this.B = 255;
				break;
			case NERO:
				this.R = 0;
				this.G = 0;
				this.B = 0;
				break;
		}
	}
		
	public ColoreRGB() {
		super();
		this.R = 255;
		this.G = 255;
		this.B = 255;
	}

	private int checkRange(int valore) {
		if(valore<0) {
			valore=0;
		}else if(valore>255) {
			valore=255;
		}
		return valore;
	}
	
	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = checkRange(r);
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = checkRange(g);
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = checkRange(b);
	}
	
	@Override
	public String toString() {
		String ret = " Rosso: "+getR()+" Blu: "+getB()+" Verde: "+getG();
		return ret;
	}

	
}
