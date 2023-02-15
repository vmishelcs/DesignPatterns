package main.java.factorypattern.factorymethod.products;

import main.java.factorypattern.factorymethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Cheese Pizza";
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + name + " into square slices");
    }
}
