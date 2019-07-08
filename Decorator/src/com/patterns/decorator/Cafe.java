package com.patterns.decorator;

public class Cafe extends Beverage {
    Cafe() {
        name = "Cafe";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
