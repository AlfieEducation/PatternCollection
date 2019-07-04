package com.patterns.strategy.duck;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class DecoyDuck extends Duck {

    public void display () {
        System.out.println("I'm a real DecoyDuck duck");
    }

    public DecoyDuck()
    {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

}