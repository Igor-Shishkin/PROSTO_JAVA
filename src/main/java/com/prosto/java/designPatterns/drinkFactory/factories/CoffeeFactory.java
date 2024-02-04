package com.prosto.java.designPatterns.drinkFactory.factories;

import com.prosto.java.designPatterns.drinkFactory.entities.Coffee;
import com.prosto.java.designPatterns.drinkFactory.entities.Drink;

public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
