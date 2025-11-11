package it.unipv.ingsfw.pattern.other;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class ValuableFactoryReflection {

	private IValuableAdapter adapter;
	private final String PROPERTYNAME="valuable.adapter.class.name";
	
	
	public IValuableAdapter getValuableAdapter(EUWallet euw) {

		if(adapter==null) {

			Properties p = new Properties(System.getProperties());
			String valuableAdaptClassName;
			
			try {
				p.load(new FileInputStream("properties/properties"));
				valuableAdaptClassName=p.getProperty(PROPERTYNAME);
				
				Constructor c = Class.forName(valuableAdaptClassName).getConstructor(EUWallet.class);
				adapter=(IValuableAdapter)c.newInstance(euw);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				adapter=new USDollarAdapterImpl(euw);
			}
			
		}
		
		return adapter;
	}

	public static void main(String[] args) {
		EUWallet ew=new EUWallet(5);
		ValuableFactoryReflection f =new ValuableFactoryReflection();
		
		System.out.println("Wallet in EU: "+ew.getValue());
		System.out.println("Wallet in "+f.getValuableAdapter(ew).getName()+": "+f.getValuableAdapter(ew).getValue());
	}
}
