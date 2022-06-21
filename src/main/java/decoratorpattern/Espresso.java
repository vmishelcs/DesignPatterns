package main.java.decoratorpattern;

public class Espresso extends Beverage {
	private final double cost = 1.99;
	
	public Espresso() {
		description = "Espresso ($" + cost + ")";
	}

	@Override
	public double getCost() {
		return cost;
	}
}
