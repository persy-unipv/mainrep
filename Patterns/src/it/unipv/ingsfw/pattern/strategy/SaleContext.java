package it.unipv.ingsfw.pattern.strategy;

public class SaleContext {
	
	private ISaleDiscountStrategy strategy;
	private double price;
	
	public SaleContext() {
		//Creiamo strategy
		DiscountFactory f=new DiscountFactory();
		strategy=f.getDiscountStrategy();
		
		//Inizializziamo il totale...simuliamo la vedita
		simulate();
	}
	
	//metodo per simulare la vendita...
	private void simulate() {
		
		price=Math.random()*1000;
	}

	
	public double getPrice() {
		return price;
	}

	public double getTotal() {
		// TODO Auto-generated method stub
		return strategy==null?price:strategy.getTotal(this);
	}
	
	public static void main(String[] args) {
		SaleContext sale=new SaleContext();
		System.out.println("Price "+ sale.getPrice());
		System.out.println("Discount Price "+sale.getTotal());
	}

}
