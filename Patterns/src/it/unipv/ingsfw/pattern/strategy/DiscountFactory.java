package it.unipv.ingsfw.pattern.strategy;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import it.unipv.ingsfw.pattern.other.EUWallet;
import it.unipv.ingsfw.pattern.other.IValuableAdapter;
import it.unipv.ingsfw.pattern.other.USDollarAdapterImpl;

public class DiscountFactory {
	
	private ISaleDiscountStrategy discount;
	private final String PROPERTYNAME="discount.strategy.class.name";

	public ISaleDiscountStrategy getDiscountStrategy() {
	
		if(discount==null) {

			Properties p = new Properties(System.getProperties());
			String DiscountClassName;
			
			try {
				p.load(new FileInputStream("properties/properties"));
				DiscountClassName=p.getProperty(PROPERTYNAME);
				
				Constructor c = Class.forName(DiscountClassName).getConstructor();
				discount=(ISaleDiscountStrategy)c.newInstance();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				discount=null;
			}
			
		}
		
		return discount;
	}


}
