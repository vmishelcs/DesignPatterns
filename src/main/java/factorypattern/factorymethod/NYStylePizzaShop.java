package main.java.factorypattern.factorymethod;

import main.java.factorypattern.factorymethod.products.*;

public class NYStylePizzaShop extends PizzaShop {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        else {
            throw new RuntimeException("Invalid Pizza type!");
        }
    }
}
