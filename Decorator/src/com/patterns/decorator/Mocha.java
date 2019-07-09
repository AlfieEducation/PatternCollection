package com.patterns.decorator;

public class Mocha extends BeverageDecorator {

    protected Beverage beverage;

    public Mocha(Beverage b) {
        this.beverage = b;
    }

    @Override
    public double getCost() {
        return .20 + beverage.getCost();
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Mocha";
    }
}
