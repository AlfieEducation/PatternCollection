package com.patterns.strategy.quack;

public class SqueakQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Duck is squeak");
    }
}
