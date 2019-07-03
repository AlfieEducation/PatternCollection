package com.patterns.strategy.flying;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class FlyNoWay implements FlyingBehaviour {

    public void fly() {
        System.out.println("I can't flying!");
    }
}
