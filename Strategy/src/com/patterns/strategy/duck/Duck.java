package com.patterns.strategy.duck;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public abstract class Duck {
    FlyingBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    public abstract void display ();

    public void swim() {
        System.out.println("All ducks float, even decoys!")
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

}