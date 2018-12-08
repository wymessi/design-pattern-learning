package com.wymessi.decorator;

/**
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description = "Espresso";
    }
}
