package com.prosto.java.designPatterns.structural.decotator;

public class FoamedMilk extends CoffeeDecorator {

    public FoamedMilk(Coffee coffee) {
        super(coffee);
    }

    private String addFoamedMilk() {
        return " Add foamed milk.\n";
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + addFoamedMilk();
    }
}
