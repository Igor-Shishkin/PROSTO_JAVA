package com.prosto.java.designPatterns.structural.decotator;

public class WhiskySyrup extends CoffeeDecorator {

    public WhiskySyrup(Coffee coffee) {
        super(coffee);
    }

    private String addWhiskySyrup() {
        return " Add whisky syrup\n";
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + addWhiskySyrup();
    }
}
