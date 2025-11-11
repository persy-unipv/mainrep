package it.unipv.pois.mezzi;

public class Imbarcazione extends Veicolo{
	private String timone;

	public Imbarcazione(String targa, String marca, int n_ruote, String timone) {
		super(targa, marca, n_ruote);
		this.timone = timone;
	}

	public String getTimone() {
		return timone;
	}

	public void setTimone(String timone) {
		this.timone = timone;
	}
	
	
	
}
