package com.prosto.java.designPatterns.structural.bridge;

public abstract class Beverage {
    protected final Additive additive;

    protected Beverage(Additive additive) {
        this.additive = additive;
    }

    abstract void serve();
}
