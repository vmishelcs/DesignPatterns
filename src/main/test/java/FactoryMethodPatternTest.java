package main.test.java;

import main.java.factorypattern.factorymethod.*;

public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        // Create two pizza stores.
        PizzaShop chicagoPizzaShop = new ChicagoStylePizzaShop();
        PizzaShop nyPizzaShop = new NYStylePizzaShop();

        Pizza pizza1 = nyPizzaShop.order("cheese");
        Pizza pizza2 = chicagoPizzaShop.order("pepperoni");
    }
}
