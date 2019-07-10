package com.patterns.factory.simplefactory;

public class SimplePizzaFactory {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case ("cheese"):
                pizza = new CheesePizza();
                break;
            case ("pepperoni"):
                pizza = new PepperoniPizza();
                break;
            case ("veggie"):
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
