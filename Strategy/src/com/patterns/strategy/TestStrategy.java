package com.patterns.strategy;

import com.patterns.strategy.flying.duck.*;
import com.patterns.strategy.flying.*;
import com.patterns.strategy.quack.*;

public class TestStrategy {

    public static void main(String [] args) {
        Duck mullard = new MullardDuck();
        mullard.performQuack();
        mullard.performFly();

        Duck model = new ModelDuck();
        model.performQuack();
        model.setFlyBehaviour(new FlyRocketPower());
        model.performFly();
    }
}