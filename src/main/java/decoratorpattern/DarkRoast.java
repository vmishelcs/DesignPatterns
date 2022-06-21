package main.java.decoratorpattern;

public class DarkRoast extends Beverage {
	private final double cost = 0.99;
	
	public DarkRoast() {
		description = "Dark Roast ($" + cost + ")";
	}

	@Override
	public double getCost() {
		return cost;
	}
}
