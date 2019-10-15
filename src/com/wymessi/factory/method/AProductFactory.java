package com.wymessi.factory.method;

public class AProductFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new AProduct();
    }
}
