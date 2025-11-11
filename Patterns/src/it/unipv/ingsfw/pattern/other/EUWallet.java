package it.unipv.ingsfw.pattern.other;

import java.util.Observable;

public class EUWallet implements IValuable {
	
	private double val;
	
	

	public EUWallet(double val) {
		super();
		this.val = val;
	}




	public void setVal(double val) {
		this.val = val;
	}




	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return val;
	}
	
	public static void main(String[] args) {
		EUWallet ew=new EUWallet(5);
		USDollarAdapterImpl usadapt=new USDollarAdapterImpl(ew);
		
		System.out.println("Wallet in EU: "+ew.getValue());
		System.out.println("Wallet in Dollar: "+usadapt.getValue());
	}

}
