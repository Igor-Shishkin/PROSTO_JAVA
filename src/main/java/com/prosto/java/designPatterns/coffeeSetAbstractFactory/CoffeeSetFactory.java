package com.prosto.java.designPatterns.coffeeSetAbstractFactory;

public interface CoffeeSetFactory {
    Coffee makeCoffee();
    Sprinkles addSprinkles();
    Dessert addDessert();
}
