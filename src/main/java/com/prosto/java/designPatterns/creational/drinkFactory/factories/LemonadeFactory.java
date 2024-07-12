package com.prosto.java.designPatterns.creational.drinkFactory.factories;

import com.prosto.java.designPatterns.creational.drinkFactory.entities.Drink;
import com.prosto.java.designPatterns.creational.drinkFactory.entities.Lemonade;

public class LemonadeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Lemonade();
    }
}
