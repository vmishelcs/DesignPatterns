package main.test.java;

import main.java.factorypattern.simplefactory.*;

public class SimpleFactoryPatternTest {
    public static void main(String args[]) {
        // Create a pizza factory and pizza shop.
        SimplePizzaFactory factory = new SimplePizzaFactory();
        SimplePizzaShop shop = new SimplePizzaShop(factory);

        // Order some pizzas.
        Pizza cheesePizza = shop.order("cheese");
        Pizza veggiePizza = shop.order("veggie");
        Pizza pepperoniPizza = shop.order("pepperoni");
    }
}
