package it.unipv.pois.mezzi;

public class Deposito {
	private Veicolo[] parcheggio;
	private int size;
	private int indice;
	
	public Deposito() {
		super();
		this.size = 100;
		this.indice = 0;
		this.parcheggio = new Veicolo[size];
	}
	
	

	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public int getIndice() {
		return indice;
	}



	public void setIndice(int indice) {
		this.indice = indice;
	}



	public Veicolo[] getParcheggio() {
		return parcheggio;
	}

	public void setParcheggio(Veicolo[] parcheggio) {
		this.parcheggio = parcheggio;
	}
	
	public boolean aggiungiVeicolo(Veicolo v) {
		if(indice<size) {
			parcheggio[indice] = v;
			indice++;
			return true;
		}
		return false;
	}
	
	public Veicolo getVeicoloAtPosizione(int posizione) {
		return parcheggio[posizione];
	}
	
	
	public static void main(String[] args) {
		Taxi t = new Taxi("A0001", "Marca", 4, 100, 0.0);
		System.out.println("La marca è: "+t.getMarca());
		System.out.println("La licenza è: "+t.getNum_license());
		
		Veicolo v = new Taxi("B0002","Marca2", 4, 101, 1.0);
		System.out.println("La marca è: "+v.getMarca());
		//Annche se abbiamo istanziato un oggetto Taxi, lo abbiamo referenziato con una reference Veicolo, quindi
		// i metodi della sottoclasse Taxi non gli sono disponibili
		//System.out.println("La licenza è: "+v.getNum_license());
		
		//Facciamo il casting di v (Veicolo) per farlo diventare di tipo Taxi: se i due tipi sono compatibili
		// si può fare sempre l'operazione di casting
		Taxi t1 = (Taxi)v;
		
		System.out.println("La licenza è: "+t1.getNum_license());
		
		// v è un ref. di tipo Veicolo che è compatibile con Imbarcazione, ma v referenzia un Taxi che non può essere castato
		// a Imbarcazione
		// Nella gerarchia delle classi ci possiamo spostare in verticale (da Veicolo a Taxi) ma non in orizzontale (da Taxi a Imbarcazione)
		
		// Imbarcazione i = (Imbarcazione)v;
		
		Imbarcazione i2 = new Imbarcazione("I0002", "B2", 0, "Boh");
		
		Deposito d = new Deposito();
		
		//System.out.println(d.getIndice());
		
		//syso stampa stringhe, quindi se è presente un toString per il tipo di dato da stampare, to chiama in automatico
		//siccome sono tipi Oggetto creati da noi, ci stampa un id dell'oggetto perchè non esiste un toString adatto.
		//Se ovverridiamo toString per i tipi che vogliamo stampare, i toString overrideati vengono chiamati
		//automaticamente da syso
		System.out.println(d.aggiungiVeicolo(t));
		System.out.println(d.aggiungiVeicolo(i2));
		
		
		Moto m = new Moto("M001", "BMW", 2, 400);
		System.out.println(d.aggiungiVeicolo(m));
		
		//System.out.println(d.getVeicoloAtPosizione(2));
		
		
		for(int i=0; i<d.getIndice(); i++) {
			System.out.println(d.getVeicoloAtPosizione(i));
		}
		
	}
	
	
}
