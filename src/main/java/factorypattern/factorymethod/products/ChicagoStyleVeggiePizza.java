package main.java.factorypattern.factorymethod.products;

import main.java.factorypattern.factorymethod.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago Style Pepperoni Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name + " into square slices");
    }
}
