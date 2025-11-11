package it.unipv.ingsfw.pattern.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.ingsfw.pattern.adapter.Addestratore;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.Cane;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.Gatto;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini.BovinoAdapter;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini.IBovino;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.bovini.Mucca;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.equini.Cavallo;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.equini.EquinoAdapter;
import it.unipv.ingsfw.pattern.adapter.quadrupedi.equini.IEquino;
import it.unipv.ingsfw.pattern.other.EUWallet;

public class QuadrupediFactory {

	private static EquinoAdapter eadapter;
	private static BovinoAdapter badapter;
	private static final String E_PROPERTYNAME="equino.adapter.class.name";
	private static final String B_PROPERTYNAME="bovino.adapter.class.name";


	public static EquinoAdapter getEquinoAdapter(IEquino eq) {

		if(eadapter==null) {
			String equinoAdaptClassName;

			try {
				Properties p = new Properties(System.getProperties());
				p.load(new FileInputStream("properties/properties"));
				equinoAdaptClassName=p.getProperty(E_PROPERTYNAME);

				Constructor c = Class.forName(equinoAdaptClassName).getConstructor(IEquino.class);
				eadapter=(EquinoAdapter)c.newInstance(eq);
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return eadapter;
	}

	public static BovinoAdapter getBovinoAdapter(IBovino b) {

		if(badapter==null) {
			String bovinoAdaptClassName;

			try {
				Properties p = new Properties(System.getProperties());
				p.load(new FileInputStream("properties/properties"));
				bovinoAdaptClassName=p.getProperty(B_PROPERTYNAME);

				Constructor c = Class.forName(bovinoAdaptClassName).getConstructor(IBovino.class);
				badapter=(BovinoAdapter)c.newInstance(b);
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return badapter;
	}

	public static void main(String[] args) {

		Cane c= new Cane();
		Gatto g=new Gatto();
		Cavallo ca=new Cavallo();
		Mucca m= new Mucca();

		Addestratore guida=new Addestratore();

		guida.aggiungiAnimale(c);
		guida.aggiungiAnimale(g);
		guida.aggiungiAnimale(QuadrupediFactory.getEquinoAdapter(ca));
		guida.aggiungiAnimale(QuadrupediFactory.getBovinoAdapter(m));
		System.out.println("\n");
		guida.camminate();
		guida.saltate();

	}

}
