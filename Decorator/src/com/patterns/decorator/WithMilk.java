package com.patterns.decorator;

public class WithMilk extends BeverageDecorator {

    public WithMilk() {

    }

    @Override
    public int getCost() {
        return 100;
    }



}
