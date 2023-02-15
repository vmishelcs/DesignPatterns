package main.java.factorypattern.simplefactory;

import main.java.factorypattern.simplefactory.products.*;

public class SimplePizzaFactory {
    public SimplePizzaFactory() { }

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        else {
            throw new RuntimeException("Invalid Pizza type!");
        }

        return pizza;
    }
}
