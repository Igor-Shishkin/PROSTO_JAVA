package com.prosto.java.designPatterns.creational.coffeeSetAbstractFactory;

public interface CoffeeSetFactory {
    Coffee makeCoffee();
    Sprinkles addSprinkles();
    Dessert addDessert();
}
