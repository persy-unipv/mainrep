package it.unipv.pois.libri;

public class Materiale {
	
	private String nome;
	private String codice; 
	private boolean disponibile; 
	private double prezzo;

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String disp;
		String res;
		if(disponibile==true) {
			disp=" disponibile";
			
		}else {
			disp=" non disponibile";
		}
		res= ("Salve, questo è il materiale "+nome+", con il seguente codice"+codice+", il libro selezionato è"+disp+"e costa"+prezzo);
		return res; 
		
	}
	
	
}
	

