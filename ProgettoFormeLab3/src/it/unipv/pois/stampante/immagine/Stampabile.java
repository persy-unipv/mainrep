package it.unipv.pois.stampante.immagine;

import java.util.HashMap;

import it.unipv.pois.stampante.colore.Colore;

public interface Stampabile {
	final public double GAMMA = 0.05;
	public HashMap<Colore, Double> getInchiostroRichiesto();
}
