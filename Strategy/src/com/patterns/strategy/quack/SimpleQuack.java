package com.patterns.strategy.quack;

public class SimpleQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Duck is quack");
    }
}
