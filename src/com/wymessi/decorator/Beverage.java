package com.wymessi.decorator;

/**
 * 饮料基础类
 */
public abstract class Beverage {
    String description = "UNKNOWN BEVERAGE";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
