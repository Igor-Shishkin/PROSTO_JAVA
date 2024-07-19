package com.prosto.java.designPatterns.structural.bridge;

public class Syrup implements Additive{
    @Override
    public void add() {
        System.out.println(" with syrup.");
    }
}
