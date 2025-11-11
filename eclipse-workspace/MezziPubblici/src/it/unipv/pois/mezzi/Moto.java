package it.unipv.pois.mezzi;

public class Moto extends Veicolo{
	private int cilindrata;

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public Moto(String targa, String marca, int n_ruote, int cilindrata) {
		super(targa, marca, n_ruote);
		this.cilindrata = cilindrata;
	}

	
	
}
