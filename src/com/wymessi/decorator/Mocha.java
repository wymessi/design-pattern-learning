package com.wymessi.decorator;

/**
 * 摩卡调味
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.53;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
