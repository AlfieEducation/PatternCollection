package com.patterns.factory.method;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String name) {
        Pizza pizza = null;
        switch (name) {
            case ("cheese"):
                pizza = new NYCheesePizza();
                break;
            case ("pepperoni"):
                pizza = new NYPepperoniPizza();
                break;
            case ("veggie"):
                pizza = new NYVeggiePizza();
                break;
        }
        return pizza;
    }
}
