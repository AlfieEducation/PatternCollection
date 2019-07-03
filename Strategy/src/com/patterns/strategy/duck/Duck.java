package com.patterns.strategy.duck;

import com.patterns.strategy.flying.FlyingBehaviour;
import com.patterns.strategy.quack.QuackBehaviour;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;

    abstract void display ();

    void swim() {

    }

    void fly() {
        flyingBehaviour.fly();
    }

    void quack() {
        quackBehaviour.quack();
    }
}