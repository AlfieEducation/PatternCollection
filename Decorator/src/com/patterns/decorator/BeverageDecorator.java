package com.patterns.decorator;

public class BeverageDecorator extends Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage b) {
        this.beverage = b;
    }

    public BeverageDecorator() {

    }

    @Override
    public int getCost() {
        return getCost();
    }
}
