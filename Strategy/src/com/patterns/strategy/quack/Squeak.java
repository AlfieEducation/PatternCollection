package com.patterns.strategy.quack;

import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
