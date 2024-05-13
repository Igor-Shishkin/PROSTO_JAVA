package com.prosto.java.designPatterns.prototype;

public class CoffeeFactory {
    private Coffee coffee;

    public CoffeeFactory(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee createCopy() {
        return (Coffee) coffee.createCopy();
    }
}
