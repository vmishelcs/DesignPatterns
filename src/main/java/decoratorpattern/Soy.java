package main.java.decoratorpattern;

public class Soy extends CondimentDecorator {
	private Beverage beverage;
	private final double condimentCost = 0.15;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "\n\tSoy ($" + condimentCost + ")";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}
}
