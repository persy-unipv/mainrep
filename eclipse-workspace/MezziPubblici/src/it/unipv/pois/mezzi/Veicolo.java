package it.unipv.pois.mezzi;

public class Veicolo {
	private String targa;
	private String marca;
	private int n_ruote;
	
	
	public Veicolo(String targa, String marca, int n_ruote) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.n_ruote = n_ruote;
	}
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getN_ruote() {
		return n_ruote;
	}
	public void setN_ruote(int n_ruote) {
		this.n_ruote = n_ruote;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res = "Sono Veicolo: "+targa;
		return res;
	}
	
	
	
	
	
}
