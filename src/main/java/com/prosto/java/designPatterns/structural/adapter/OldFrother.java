package com.prosto.java.designPatterns.structural.adapter;

public class OldFrother implements FrotherABC {
    @Override
    public void frothMilk() {
        System.out.println("Milk is frothed");
    }

    @Override
    public void heatMilk() {
        System.out.println("Milk heated");
    }
}
