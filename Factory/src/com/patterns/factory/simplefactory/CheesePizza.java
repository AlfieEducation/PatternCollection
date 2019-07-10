package com.patterns.factory.simplefactory;

public class CheesePizza extends Pizza {

    CheesePizza() {
        name = "Cheese Pizza";
        String dough = "Regular Crust";
        String sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
