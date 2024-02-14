package com.prosto.java.designPatterns.coffeeSetAbstractFactory.espressoSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Coffee;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.CoffeeSetFactory;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Dessert;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Sprinkles;

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
