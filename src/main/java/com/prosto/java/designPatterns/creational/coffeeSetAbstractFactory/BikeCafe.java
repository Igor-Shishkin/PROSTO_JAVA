package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory;

import com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory.LatteSet.LatteSetFactory;

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
