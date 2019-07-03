package com.patterns.strategy.duck;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class RubberDuck extends Duck {

    public void display () {
        System.out.println("I'm a real RubberDuck duck");
    }

    public RubberDuck()
    {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

}