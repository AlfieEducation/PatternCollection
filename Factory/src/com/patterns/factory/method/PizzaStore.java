package com.patterns.factory.method;

public abstract class PizzaStore {

    Pizza orderPizza(String name) {
        Pizza pizza = createPizza(name);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String name);
}
