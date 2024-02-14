package com.prosto.java.designPatterns.coffeeSetAbstractFactory.LatteSet;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Coffee;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.CoffeeSetFactory;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Dessert;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.Sprinkles;

public class LatteSetFactory implements CoffeeSetFactory {
    @Override
    public Coffee makeCoffee() {
        return new Latte();
    }

    @Override
    public Sprinkles addSprinkles() {
        return new Cinnamon();
    }

    @Override
    public Dessert addDessert() {
        return new TiramisuCake();
    }
}
