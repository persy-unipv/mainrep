package it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini;

import it.unipv.ingsfw.pattern.adapter.quadrupedi.IQuadrupede;

public class BovinoAdapter implements IQuadrupede {

	private IBovino bovino;

	public BovinoAdapter(IBovino bovino) {

		this.bovino=bovino;
	}
	@Override
	public String cammina() {
		// TODO Auto-generated method stub
		return bovino.muoviPiano();
	}

	@Override
	public String salta() {
		// TODO Auto-generated method stub
		return bovino.faiVerso()+" Non posso saltare";
	}

	@Override
	public String corri() {
		// TODO Auto-generated method stub
		return bovino.muoviVeloce();
	}
	@Override
	public String verso() {
		// TODO Auto-generated method stub
		return bovino.faiVerso();
	}

}
