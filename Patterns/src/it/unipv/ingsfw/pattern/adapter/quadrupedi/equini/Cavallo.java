package it.unipv.ingsfw.pattern.adapter.quadrupedi.equini;

public class Cavallo implements IEquino{

	public String VERSO="HII";
	@Override
	public String trotto() {
		// TODO Auto-generated method stub
		return VERSO+" Trotto";
	}

	@Override
	public String galoppo() {
		// TODO Auto-generated method stub
		return VERSO+" Galoppo";
	}

	@Override
	public String salta() {
		// TODO Auto-generated method stub
		return VERSO+" Salto";
	}

	@Override
	public String verso() {
		// TODO Auto-generated method stub
		return VERSO;
	}

}
