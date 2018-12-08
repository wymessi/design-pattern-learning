package com.wymessi.decorator;

/**
 * 奶泡调味
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.43;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }
}
