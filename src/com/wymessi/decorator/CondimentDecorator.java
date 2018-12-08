package com.wymessi.decorator;

/**
 * 调味料装饰类，必须继承饮料的父类
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
