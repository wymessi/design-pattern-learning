package com.wymessi.strategy;

/**
 * 鸭子抽象类
 */
public abstract class Duck {
    private FlyBehavior flyBehavior; //将飞行行为抽出，视为一种策略
    private QuackBehavior quackBehavior; //将叫声行为抽出，视为一种策略

    public abstract void display(); //抽象方法，展示属于什么鸭子，仅仅为了演示方便

    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
