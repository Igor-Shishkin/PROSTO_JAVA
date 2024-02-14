package com.prosto.java.designPatterns.coffeeSetAbstractFactory;

import com.prosto.java.designPatterns.coffeeSetAbstractFactory.LatteSet.LatteSetFactory;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.cuppuccinoSet.CappuccinoSetFactory;
import com.prosto.java.designPatterns.coffeeSetAbstractFactory.espressoSet.EspressoSetFactory;

public class BikeCafe {
    public static void main(String[] args) {

        CoffeeSetFactory coffeeSetFactory = new LatteSetFactory();

        Coffee coffee = coffeeSetFactory.makeCoffee();
        Sprinkles sprinkles = coffeeSetFactory.addSprinkles();
        Dessert dessert = coffeeSetFactory.addDessert();

        coffee.getCoffee();
        sprinkles.getSprinkles();
        dessert.getDessert();

    }
}
