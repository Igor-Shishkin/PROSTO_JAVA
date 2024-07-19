package com.prosto.java.designPatterns.structural.bridge;

public class Sugar implements Additive{
    @Override
    public void add() {
        System.out.println(" with sugar.");
    }
}
