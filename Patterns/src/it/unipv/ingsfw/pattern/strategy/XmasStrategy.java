package it.unipv.ingsfw.pattern.strategy;

public class XmasStrategy implements ISaleDiscountStrategy{

	private final double MULTIPLIER=0.5;
	@Override
	public double getTotal(SaleContext sale) {
		// TODO Auto-generated method stub
		return sale.getPrice()*MULTIPLIER;
	}

}
