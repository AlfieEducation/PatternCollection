package com.patterns.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        name = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.20;
    }
}
