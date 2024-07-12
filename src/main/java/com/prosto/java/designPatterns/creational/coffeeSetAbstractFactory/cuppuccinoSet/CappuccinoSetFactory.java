package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.cuppuccinoSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Coffee;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.CoffeeSetFactory;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Dessert;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Sprinkles;

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
