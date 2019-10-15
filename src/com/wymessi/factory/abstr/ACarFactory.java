package com.wymessi.factory.abstr;

public class ACarFactory implements CarFactory {
    @Override
    public Tire createTire() {
        return new NormalTire();
    }

    @Override
    public Break createBreak() {
        return new NormalBreak();
    }
}
