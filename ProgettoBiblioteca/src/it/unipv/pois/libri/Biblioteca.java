package it.unipv.pois.libri;

public class Biblioteca {

	private String luogo;
	private String indirizzo; 
	private String orario; 
	private int posti_disponibili;
	private Materiale [] materiale; 
	private int posizioni_scaffale;	
	private int indice; 
	
	
	
	
	

	
	
	
	
	public boolean aggiungiMateriale(Materiale m) {
		if(indice<posizioni_scaffale) {
			m = materiale[indice];
			System.out.println("Nuovo materiale aggiunto!");
			return true;
			
		}else {
			System.out.println("Mi dispiace non ci sono posti sullo scaffale ");
			return false;
			
		}
		
		
	}
		
	
	
	

}
