package com.patterns.decorator;

public class Milk extends BeverageDecorator {

    protected Beverage beverage;

    public Milk(Beverage b) {
        this.beverage = b;
    }

    @Override
    public double getCost() {
        return .10 + beverage.getCost();
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Milk";
    }
}
