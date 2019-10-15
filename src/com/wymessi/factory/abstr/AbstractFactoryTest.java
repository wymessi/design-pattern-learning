package com.wymessi.factory.abstr;

/**
 * 抽象工厂测试
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory a = new ACarFactory();
        a.createBreak().cbreak();
        a.createTire().tire();

        CarFactory b = new BCarFactory();
        b.createBreak().cbreak();
        b.createTire().tire();
    }
}
