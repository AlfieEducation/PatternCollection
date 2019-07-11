package com.patterns.factory.method;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        Pizza pizza = null;
        switch (name) {
            case ("cheese"):
                pizza = new CACheesePizza();
                break;
            case ("pepperoni"):
                pizza = new CAPepperoniPizza();
                break;
            case ("veggie"):
                pizza = new CAVeggiePizza();
                break;
        }
        return pizza;
    }
}
