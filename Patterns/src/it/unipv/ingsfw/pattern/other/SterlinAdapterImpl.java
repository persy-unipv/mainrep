package it.unipv.ingsfw.pattern.other;

public class SterlinAdapterImpl implements IValuableAdapter{
	
	private EUWallet euw;
	private final String NAME="Sterlin";
	private final double RATE=0.84;
	
	public SterlinAdapterImpl(EUWallet euw) {
		super();
		this.euw = euw;
	}

	private double convertEUToSterline()
	{
		return euw.getValue()*RATE;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return convertEUToSterline();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

}
