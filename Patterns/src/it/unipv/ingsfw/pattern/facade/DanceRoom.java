package it.unipv.ingsfw.pattern.facade;

import it.unipv.ingsfw.pattern.facade.instruments.MusicalBandFacade;

public class DanceRoom {
	
	public static void main(String[] args) {
		
		MusicalBandFacade.getInstance().play();
	}

}
