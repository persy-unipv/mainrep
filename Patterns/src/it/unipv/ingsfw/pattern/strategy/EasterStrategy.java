package it.unipv.ingsfw.pattern.strategy;

public class EasterStrategy implements ISaleDiscountStrategy{
	
	private final double MULTIPLIER=0.5;
	private final double SUB_MULTIPLIER=0.8;
	@Override
	public double getTotal(SaleContext sale) {
		// TODO Auto-generated method stub
		return ((sale.getPrice()*MULTIPLIER)*SUB_MULTIPLIER);
	}
}
