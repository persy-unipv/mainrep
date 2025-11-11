package it.unipv.ingsfw.pattern.strategy;

public class GoodCustomerStrategy implements ISaleDiscountStrategy{

	private final double MULTIPLIER_1=0.9;
	private final double MULTIPLIER_2=0.4;
	private final double IMPORT=500;
	@Override
	public double getTotal(SaleContext sale) {
		
		return sale.getPrice()>IMPORT?sale.getPrice()*MULTIPLIER_2:sale.getPrice()*MULTIPLIER_1;
		
	}
}
