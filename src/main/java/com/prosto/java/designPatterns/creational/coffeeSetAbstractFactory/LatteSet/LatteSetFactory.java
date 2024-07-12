package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.LatteSet;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Coffee;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.CoffeeSetFactory;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Dessert;
import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.Sprinkles;

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
