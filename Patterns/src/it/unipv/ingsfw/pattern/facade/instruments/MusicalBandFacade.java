package it.unipv.ingsfw.pattern.facade.instruments;

public class MusicalBandFacade {

	private IInstrument guitar;
	private IInstrument bass;
	private IInstrument drum;
	private static MusicalBandFacade instance;

	private MusicalBandFacade() {

		guitar=new Guitar();
		bass=new Bass();
		drum=new Drum();
	}
	
	public static MusicalBandFacade getInstance() {
		if(instance==null)
			instance=new MusicalBandFacade();
		return instance;
	}

	public void play() {
		System.out.println(guitar.play()+"\n"+
		bass.play()+"\n"+
		guitar.play()+"\n"+
		drum.play()+"\n"+
		bass.play()+"\n"+
		drum.play()+"\n"+
		guitar.play()+"\n");
	}
}
