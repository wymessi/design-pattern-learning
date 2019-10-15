package com.wymessi.factory.abstr;

public class BCarFactory implements CarFactory {
    @Override
    public Tire createTire() {
        return new BigTire();
    }

    @Override
    public Break createBreak() {
        return new ForeignBreak();
    }
}
