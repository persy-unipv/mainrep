package it.unipv.pois.libri;

public class Libro extends Materiale {
	
	private String autore;
	private String anno_pubblicazione;
	private int numero_pagine;
	private String tipologia;
	
	
	
	
	
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getAnno_pubblicazione() {
		return anno_pubblicazione;
	}

	public void setAnno_pubblicazione(String anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}

	public int getNumero_pagine() {
		return numero_pagine;
	}

	public void setNumero_pagine(int numero_pagine) {
		this.numero_pagine = numero_pagine;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {

		this.tipologia = tipologia;
	}
	
	
	
	
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res;
		res = super.toString()+"dell'autore"+autore+"pubblicato"+anno_pubblicazione ;
		return res; 
		
	}
	
	public void consigli(){
		
		if(numero_pagine<100) 
			System.out.println("Prova a leggere libri più grandi ");
		
		else if(numero_pagine>=100 &&numero_pagine<=200) 
			System.out.println("Bella scelta");

		else if(numero_pagine>200) 
			System.out.println("King guardati un film");
		
		
		
			
				
		
		
	}
	
	

}
