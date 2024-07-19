package com.prosto.java.designPatterns.structural.bridge.problem;

public class Coffee extends Beverage{
    @Override
    public void serve() {
        System.out.println("Coffee");
    }
}
