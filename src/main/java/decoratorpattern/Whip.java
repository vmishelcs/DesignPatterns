package main.java.decoratorpattern;

public class Whip extends CondimentDecorator {
	private Beverage beverage;
	private final double condimentCost = 0.10;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "\n\tWhip ($" + condimentCost + ")";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}
}
