package com.wymessi.strategy;

/**
 * 模型鸭 不会叫不会飞
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
