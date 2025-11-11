package it.unipv.pois.mezzi;

public class Taxi extends Veicolo {
	private int num_license;
	private double tassametro;
	
	public Taxi(String targa, String marca, int n_ruote, int num_license, double tassametro) {
		super(targa, marca, n_ruote);
		this.num_license = num_license;
		this.tassametro = tassametro;
	}

	public int getNum_license() {
		return num_license;
	}

	public void setNum_license(int num_license) {
		int vera_license = num_license/2;
		this.num_license = vera_license;
	}

	public double getTassametro() {
		return tassametro;
	}

	public void setTassametro(double tassametro) {
		this.tassametro = tassametro;
	}
	
	public void setNum_license(String num_license) {
		int val = Integer.parseInt(num_license);
		// E' inutile che io riscriva setNum_license(int ...) perchè esiste già:
		// faccio overloading
		setNum_license(val);
	}

	@Override
	public String toString() {
		String res = super.toString()+" con licenza taxi: "+num_license;
		return res;
	}
	
	
	
	
	
}
