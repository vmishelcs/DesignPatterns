package main.java.decoratorpattern;

public class SteamedMilk extends CondimentDecorator {
	private Beverage beverage;
	private final double condimentCost = 0.10;
	
	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "\n\tSteamed Milk ($" + condimentCost + ")";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + condimentCost;
	}	
}
