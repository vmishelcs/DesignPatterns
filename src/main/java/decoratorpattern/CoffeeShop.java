package main.java.decoratorpattern;

public class CoffeeShop {
	public CoffeeShop() {
		// Do nothing.
	}
	
	public double orderDarkRoast(int nMocha, int nSoy, int nSteamedMilk, int nWhip) {
		Beverage beverage = new DarkRoast();
		beverage = applyCondiments(beverage, nMocha, nSoy, nSteamedMilk, nWhip);
		System.out.println("Order:\n" + beverage.getDescription());
		return beverage.getCost();
	}
	
	public double orderDecaf(int nMocha, int nSoy, int nSteamedMilk, int nWhip) {
		Beverage beverage = new Decaf();
		beverage = applyCondiments(beverage, nMocha, nSoy, nSteamedMilk, nWhip);
		System.out.println("Order:\n" + beverage.getDescription());
		return beverage.getCost();
	}
	
	public double orderEspresso(int nMocha, int nSoy, int nSteamedMilk, int nWhip) {
		Beverage beverage = new Espresso();
		beverage = applyCondiments(beverage, nMocha, nSoy, nSteamedMilk, nWhip);
		System.out.println("Order:\n" + beverage.getDescription());
		return beverage.getCost();
	}
	
	public double orderHouseBlend(int nMocha, int nSoy, int nSteamedMilk, int nWhip) {
		Beverage beverage = new HouseBlend();
		beverage = applyCondiments(beverage, nMocha, nSoy, nSteamedMilk, nWhip);
		System.out.println("Order:\n" + beverage.getDescription());
		return beverage.getCost();
	}
	
	private Beverage applyCondiments(Beverage beverage, int nMocha, int nSoy, int nSteamedMilk, int nWhip) {
		beverage = applyMocha(beverage, nMocha);
		beverage = applySoy(beverage, nSoy);
		beverage = applySteamedMilk(beverage, nSteamedMilk);
		beverage = applyWhip(beverage, nWhip);
		return beverage;
	}
	
	private Beverage applyMocha(Beverage beverage, int n) {
		for (int i = 0; i < n; ++i) {
			beverage = new Mocha(beverage);
		}
		return beverage;
	}
	private Beverage applySoy(Beverage beverage, int n) {
		for (int i = 0; i < n; ++i) {
			beverage = new Soy(beverage);
		}
		return beverage;
	}
	private Beverage applySteamedMilk(Beverage beverage, int n) {
		for (int i = 0; i < n; ++i) {
			beverage = new SteamedMilk(beverage);
		}
		return beverage;
	}
	private Beverage applyWhip(Beverage beverage, int n) {
		for (int i = 0; i < n; ++i) {
			beverage = new Whip(beverage);
		}
		return beverage;
	}
}
