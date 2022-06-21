package main.java.decoratorpattern;

public class Decaf extends Beverage {
	public final double cost = 1.05;
	
	public Decaf() {
		description = "Decaf ($" + cost + ")";
	}
	
	public double getCost() {
		return cost;
	}
}
