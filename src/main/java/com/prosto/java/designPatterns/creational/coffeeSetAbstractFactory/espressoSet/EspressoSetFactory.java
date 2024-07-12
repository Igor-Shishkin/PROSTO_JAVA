package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.espressoSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Coffee;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.CoffeeSetFactory;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Dessert;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Sprinkles;

public class EspressoSetFactory implements CoffeeSetFactory {
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }

    @Override
    public Sprinkles addSprinkles() {
        return new Nutmag();
    }

    @Override
    public Dessert addDessert() {
        return new BountyBar();
    }
}
