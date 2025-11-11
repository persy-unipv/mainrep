package it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini;

public class Mucca implements IBovino {

	public final String VERSO="MUU";
	@Override
	public String muoviPiano() {
		return VERSO+" mi muovo";
	}

	@Override
	public String muoviVeloce() {
		// TODO Auto-generated method stub
		return VERSO+" mi muovo veloce";
	}

	@Override
	public String faiVerso() {
		// TODO Auto-generated method stub
		return VERSO;
	}

}
