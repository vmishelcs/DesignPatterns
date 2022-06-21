package main.java.decoratorpattern;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	private final double condimentCost = 0.20;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "\n\tMocha ($" + condimentCost + ")";
	}
	
	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}
}
