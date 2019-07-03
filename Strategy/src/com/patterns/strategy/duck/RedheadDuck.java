package com.patterns.strategy.duck;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class RedheadDuck extends Duck {

    public void display () {
        System.out.println("I'm a real Readhead duck");
    }

    public RedheadDuck()
    {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

}