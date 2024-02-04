package com.prosto.java.designPatterns.drinkFactory.factories;

import com.prosto.java.designPatterns.drinkFactory.entities.Drink;
import com.prosto.java.designPatterns.drinkFactory.entities.Tea;

public class TeaFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Tea();
    }
}
