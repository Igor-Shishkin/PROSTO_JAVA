package com.prosto.java.designPatterns.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Coffee;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.CoffeeSetFactory;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Dessert;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Sprinkles;

public class CappuccinoSetFactory implements CoffeeSetFactory {
    @Override
    public Coffee makeCoffee() {
        return new Cappuccino();
    }

    @Override
    public Sprinkles addSprinkles() {
        return new GratedChocolate();
    }

    @Override
    public Dessert addDessert() {
        return new Truffles();
    }
}
