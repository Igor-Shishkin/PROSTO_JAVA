package com.prosto.java.designPatterns.structural.decotator;

public class ChocolateCrumbs extends CoffeeDecorator {

    public ChocolateCrumbs(Coffee coffee) {
        super(coffee);
    }

    private String addChocolateCrumbs() {
        return " Sprinkle with chocolate crumbs on top\n";
    }

    @Override
    public String makeCoffee() {
        return super.makeCoffee() + addChocolateCrumbs();
    }
}
