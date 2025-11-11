package it.unipv.ingsfw.pattern.composite;

import it.unipv.ingsfw.pattern.strategy.GoodCustomerStrategy;
import it.unipv.ingsfw.pattern.strategy.ISaleDiscountStrategy;
import it.unipv.ingsfw.pattern.strategy.SaleContext;
import it.unipv.ingsfw.pattern.strategy.XmasStrategy;

public class CompositeXmasGoodCustomer extends CompositeDiscountStrategy {
	
	public CompositeXmasGoodCustomer() {
		// TODO Auto-generated constructor stub
		super();
		super.addStrategy(new XmasStrategy());
		super.addStrategy(new GoodCustomerStrategy());
	}

	
	@Override
	public double getTotal(SaleContext sale) {
		// TODO Auto-generated method stub
		double price=sale.getPrice();
		for(ISaleDiscountStrategy ds : super.getStrategies())
			if(ds.getTotal(sale)<price)
				price=ds.getTotal(sale);
		return price;
	}

}
