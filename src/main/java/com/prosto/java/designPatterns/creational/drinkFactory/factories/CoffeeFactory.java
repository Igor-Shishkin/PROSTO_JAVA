package com.prosto.java.designPatterns.creational.drinkFactory.factories;

import com.prosto.java.designPatterns.creational.drinkFactory.entities.Coffee;
import com.prosto.java.designPatterns.creational.drinkFactory.entities.Drink;

public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
