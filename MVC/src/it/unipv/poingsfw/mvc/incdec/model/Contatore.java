package it.unipv.poingsfw.mvc.incdec.model;

public class Contatore {

	private int val;
	
	public Contatore() {
		val=0;
	}
	
	public int getVal() {
		return val;
	}
	
	public void incVal(int passo) {
		val+=passo;
	}
	public void decVal(int passo) {
		val-=passo;
	}
}
