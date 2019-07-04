package com.patterns.strategy;

import com.patterns.strategy.duck.DecoyDuck;
import com.patterns.strategy.duck.Duck;
import com.patterns.strategy.duck.MallardDuck;
import com.patterns.strategy.flying.FlyNoWay;
import com.patterns.strategy.flying.FlyRocketPowered;
import com.patterns.strategy.quack.Squeak;

public class TestStrategy {

    public static void main(String [] args) {
        Duck mullard = new MallardDuck();
        mullard.performQuack();
        mullard.performFly();

        Duck model = new DecoyDuck();
        model.performQuack();
        model.setQuackBehaviour(new Squeak());
        model.performQuack();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        model.setFlyBehaviour(new FlyNoWay());
        model.performFly();
    }
}