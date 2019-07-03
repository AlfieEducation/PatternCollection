package com.patterns.strategy.flying;

public class NonFlyingDuck implements FlyingBehaviour {

    public void fly() {
        System.out.println("Non Flying duck");
    }
}
