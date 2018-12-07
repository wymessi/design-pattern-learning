package com.wymessi.strategy;

public class StrategyPatternTest {

    public static void main(String[] args) {
        Duck realDuck = new RealDuck();
        //会飞的呱呱叫的鸭子
        realDuck.setFlyBehavior(new FlyWithThings());
        realDuck.setQuackBehavior(new Quack());
        realDuck.display();
        realDuck.fly();
        realDuck.quack();

        //不会飞不会叫的鸭子
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.display();
        modelDuck.fly();
        modelDuck.quack();
    }
}
