package com.patterns.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        name = "DarkRoast";
    }

    @Override
    public double getCost() {
        return 1.40;
    }
}
