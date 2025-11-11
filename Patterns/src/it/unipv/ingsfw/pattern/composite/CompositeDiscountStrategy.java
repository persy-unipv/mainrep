package it.unipv.ingsfw.pattern.composite;

import java.util.LinkedList;
import java.util.List;

import it.unipv.ingsfw.pattern.strategy.ISaleDiscountStrategy;
import it.unipv.ingsfw.pattern.strategy.SaleContext;

public abstract class CompositeDiscountStrategy implements ISaleDiscountStrategy{
	
	private List<ISaleDiscountStrategy> discountStrategies;
	
	protected CompositeDiscountStrategy() {
		discountStrategies=new LinkedList<ISaleDiscountStrategy>();
	}
	
	protected void addStrategy(ISaleDiscountStrategy s) {
		discountStrategies.add(s);
	}
	
	protected List<ISaleDiscountStrategy> getStrategies(){
		return discountStrategies;
	}
	
	@Override
	public abstract double getTotal(SaleContext sale);

}
