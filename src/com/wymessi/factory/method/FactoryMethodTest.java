package com.wymessi.factory.method;

/**
 * 工厂方法模式测试
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ProductFactory afactory = new AProductFactory();
        Product aproduct = afactory.createProduct();
        aproduct.product();

        ProductFactory bfactory = new BProductFactory();
        Product bproduct = bfactory.createProduct();
        bproduct.product();
    }
}
