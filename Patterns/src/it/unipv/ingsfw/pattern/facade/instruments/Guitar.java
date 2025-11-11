package it.unipv.ingsfw.pattern.facade.instruments;

public class Guitar implements IInstrument {

	private final String SOUND="Guitar Sound";
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return SOUND;
	}

}
