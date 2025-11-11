package it.unipv.ingsfw.pattern.adapter;

import java.util.LinkedList;
import java.util.List;

import it.unipv.ingsfw.pattern.adapter.quadrupedi.Cane;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.Gatto;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.IQuadrupede;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini.BovinoAdapter;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini.Mucca;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.equini.Cavallo;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.equini.EquinoAdapter;

public class Addestratore {
	
	List<IQuadrupede> animali; 
	
	public Addestratore() {
		animali=new LinkedList<IQuadrupede>();
	}
	
	public void aggiungiAnimale(IQuadrupede animale) {
		animali.add(animale);
	}
	
	public void camminate() {
		for(IQuadrupede a: animali)
			System.out.println(a.cammina());
	}
	
	public void correte() {
		for(IQuadrupede a: animali)
			System.out.println(a.corri());
	}
	
	public void saltate() {
		for(IQuadrupede a: animali)
			System.out.println(a.salta());
	}
	
	public static void main(String[] args) {
		Cane c= new Cane();
		Gatto g=new Gatto();
		Cavallo ca=new Cavallo();
		Mucca m= new Mucca();
		EquinoAdapter eq=new EquinoAdapter(ca);
		BovinoAdapter bv=new BovinoAdapter(m);
		
		Addestratore guida=new Addestratore();
		
		guida.aggiungiAnimale(c);
		guida.aggiungiAnimale(g);
		guida.aggiungiAnimale(eq);
		guida.aggiungiAnimale(bv);
		System.out.println("\n");
		guida.camminate();
		guida.saltate();
		
	}

}
