package it.unipv.ingsfw.pattern.adapter.quadrupedi;

public class Gatto implements IQuadrupede {

	public final String VERSO="MEOW";
	@Override
	public String cammina() {
		// TODO Auto-generated method stub
		return VERSO+" Cammino";
	}

	@Override
	public String salta() {
		// TODO Auto-generated method stub
		return VERSO+" Salto";
	}

	@Override
	public String corri() {
		// TODO Auto-generated method stub
		return VERSO+" Corro";
	}

	@Override
	public String verso() {
		// TODO Auto-generated method stub
		return VERSO;
	}
	
	

}
