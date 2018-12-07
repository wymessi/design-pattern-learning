package com.wymessi.strategy;

public class FlyWithThings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
