package com.prosto.java.designPatterns.drinkFactory;

public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
