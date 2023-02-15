package main.java.factorypattern.factorymethod;

import main.java.factorypattern.factorymethod.products.*;

public class ChicagoStylePizzaShop extends PizzaShop {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        else {
            throw new RuntimeException("Invalid Pizza type!");
        }
    }
}
