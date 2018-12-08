package com.wymessi.decorator;

/**
 * 首选咖啡
 */
public class HouseBlend extends Beverage{
    @Override
    public double cost() {
        return 2.99;
    }

    @Override
    public String getDescription() {
        return description = "HouseBlend";
    }
}
