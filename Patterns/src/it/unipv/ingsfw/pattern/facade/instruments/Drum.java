package it.unipv.ingsfw.pattern.facade.instruments;

public class Drum implements IInstrument {
	private final String SOUND="Drum Sound";
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return SOUND;
	}


}
