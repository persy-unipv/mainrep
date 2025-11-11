package it.unipv.ingsfw.pattern.adapter.quadrupedi.equini;

import it.unipv.ingsfw.pattern.adapter.quadrupedi.IQuadrupede;

public class EquinoAdapter implements IQuadrupede {

	private IEquino equino;
	
	public EquinoAdapter(IEquino equino) {
		
		this.equino=equino;
	}
	
	
	
	@Override
	public String cammina() {
		// TODO Auto-generated method stub
		return equino.trotto();
	}

	@Override
	public String salta() {
		// TODO Auto-generated method stub
		return equino.salta();
	}

	@Override
	public String corri() {
		// TODO Auto-generated method stub
		return equino.galoppo();
	}
	@Override
	public String verso() {
		// TODO Auto-generated method stub
		return equino.verso();
	}

}
