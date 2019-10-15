package com.wymessi.factory.method;

public class BProductFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new BProduct();
    }
}
