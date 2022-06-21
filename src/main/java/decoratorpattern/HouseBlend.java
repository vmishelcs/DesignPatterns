package main.java.decoratorpattern;

public class HouseBlend extends Beverage {
	private final double cost = 0.89;
	
	public HouseBlend() {
		description = "House Blend ($" + cost + ")";
	}
	
	@Override
	public double getCost() {
		return cost;
	}
}
