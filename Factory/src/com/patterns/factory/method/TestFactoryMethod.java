package com.patterns.factory.method;


public class TestFactoryMethod {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        CaliforniaPizzaStore caPizzaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Alex ordered a " + pizza.getName() + "\n");
        pizza = nyPizzaStore.orderPizza("pepperoni");
        System.out.println("Alex ordered a " + pizza.getName() + "\n");


        pizza = caPizzaStore.orderPizza("cheese");
        System.out.println("Eldar ordered a " + pizza.getName() + "\n");
        pizza = caPizzaStore.orderPizza("pepperoni");
        System.out.println("Eldar ordered a " + pizza.getName() + "\n");
    }
}
