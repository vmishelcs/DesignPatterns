package main.java.factorypattern.simplefactory;

import main.java.factorypattern.Pizza;

public class SimplePizzaShop {
    SimplePizzaFactory factory;

    public SimplePizzaShop(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza order(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
