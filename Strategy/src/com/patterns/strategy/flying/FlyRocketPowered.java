package com.patterns.strategy.flying;

public class FlyRocketPowered implements FlyingBehaviour {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}