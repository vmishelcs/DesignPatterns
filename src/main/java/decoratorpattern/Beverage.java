package main.java.decoratorpattern;

public abstract class Beverage {
	protected String description = "unknown beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();
}
