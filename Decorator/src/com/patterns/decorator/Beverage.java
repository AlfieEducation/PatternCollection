package com.patterns.decorator;

public abstract class Beverage {
    String name = "Beverage without name";

    public String getName() {
        return name;
    }

    abstract double getCost();
}
