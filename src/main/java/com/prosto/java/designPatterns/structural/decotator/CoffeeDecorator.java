package com.prosto.java.designPatterns.structural.decotator;

public class CoffeeDecorator implements Coffee {

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String makeCoffee() {
        return coffee.makeCoffee();
    }
}
