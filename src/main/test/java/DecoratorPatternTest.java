package main.test.java;

import main.java.decoratorpattern.CoffeeShop;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		// Create a coffee shop.
		CoffeeShop coffeeShop = new CoffeeShop();
		
		// Order some drinks.
		double darkRoastPrice = coffeeShop.orderDarkRoast(2, 0, 0, 1);
		System.out.println("Price: $" + darkRoastPrice);
		System.out.printf("\n\n");
		double decafPrice = coffeeShop.orderDecaf(1, 1, 1, 1);
		System.out.println("Price: $" + decafPrice);
		System.out.printf("\n\n");
		double espressoPrice = coffeeShop.orderEspresso(1, 1, 0, 1);
		System.out.println("Price: $" + espressoPrice);
		System.out.printf("\n\n");
		double houseBlendPrice = coffeeShop.orderHouseBlend(1, 2, 3, 4);
		System.out.println("Price: $" + houseBlendPrice);
		System.out.printf("\n\n");
	}
}
