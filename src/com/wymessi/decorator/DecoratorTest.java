package com.wymessi.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println("饮料种类："+beverage.getDescription()+ ", 价格：" + beverage.cost());


        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2= new Whip(beverage2);

        System.out.println("饮料种类："+beverage2.getDescription()+ ", 价格：" + beverage2.cost());
    }
}
