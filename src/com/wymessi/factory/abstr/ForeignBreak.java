package com.wymessi.factory.abstr;

public class ForeignBreak implements Break {
    @Override
    public void cbreak() {
        System.out.println("进口制动");
    }
}
