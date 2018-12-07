package com.wymessi.strategy;

/**
 * 真实的鸭子，会叫会飞
 */
public class RealDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a real duck");
    }
}
