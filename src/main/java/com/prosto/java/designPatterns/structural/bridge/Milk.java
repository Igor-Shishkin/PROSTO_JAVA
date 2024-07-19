package com.prosto.java.designPatterns.structural.bridge;

public class Milk implements Additive{
    @Override
    public void add() {
        System.out.println(" with milk.");
    }
}
