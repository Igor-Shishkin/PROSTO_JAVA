package com.prosto.java.designPatterns.drinkFactory.factories;

import com.prosto.java.designPatterns.drinkFactory.entities.Drink;
import com.prosto.java.designPatterns.drinkFactory.entities.Lemonade;

public class LemonadeFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Lemonade();
    }
}
