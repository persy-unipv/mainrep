package it.unipv.ingsfw.pattern.other;

public class Factory {

	private EUWallet ew;
	private USDollarAdapterImpl usadapt;
	private SterlinAdapterImpl stadapt;

	

	public Factory(EUWallet ew) {
		super();
		this.ew = ew;
	}

	public IValuableAdapter getUSDollarAdapter() {
		if(usadapt==null)
			usadapt=new USDollarAdapterImpl(ew);
		return usadapt;

	}

	public IValuableAdapter getSterlinAdapter() {
		if(stadapt==null)
			stadapt=new SterlinAdapterImpl(ew);
		return stadapt;

	}
	
	public static void main(String[] args) {
		EUWallet ew=new EUWallet(5);
		Factory f =new Factory(ew);
		
		System.out.println("Wallet in EU: "+ew.getValue());
		System.out.println("Wallet in Dollar: "+f.getUSDollarAdapter().getValue());
		System.out.println("Wallet in Sterlin: "+f.getSterlinAdapter().getValue());
	}

}
