package com.patterns.decorator;

public class Soy extends BeverageDecorator {
    protected Beverage beverage;

    public Soy(Beverage b) {
        this.beverage = b;
    }

    @Override
    public double getCost() {
        return .15 + beverage.getCost();
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Soy";
    }
}
