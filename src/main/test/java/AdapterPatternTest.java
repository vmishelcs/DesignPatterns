package main.test.java;

import main.java.adapterpattern.*;

public class AdapterPatternTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testDuck(Duck duckObject) {
        duckObject.quack();
        duckObject.fly();
    }

    private static void testTurkey(Turkey turkeyObject) {
        turkeyObject.gobble();
        turkeyObject.fly();
    }
}
