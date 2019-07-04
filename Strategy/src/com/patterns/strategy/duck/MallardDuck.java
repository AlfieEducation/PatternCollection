package com.patterns.strategy.duck;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class MallardDuck extends Duck {

    public void display () {
        System.out.println("I'm a real Mallard duck");
    }

    public MallardDuck()
    {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

}