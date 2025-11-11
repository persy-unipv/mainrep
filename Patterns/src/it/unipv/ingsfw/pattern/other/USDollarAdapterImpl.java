package it.unipv.ingsfw.pattern.other;

public class USDollarAdapterImpl implements IValuableAdapter{

	private EUWallet euw;
	private final String NAME="USDollar";
	private final double RATE=1.13;
	
	public USDollarAdapterImpl(EUWallet euw) {
		super();
		this.euw = euw;
	}

	private double convertEUToDollar()
	{
		return euw.getValue()*RATE;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return convertEUToDollar();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

}
