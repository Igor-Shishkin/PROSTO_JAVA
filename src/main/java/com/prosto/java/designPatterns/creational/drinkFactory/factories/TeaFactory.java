package com.prosto.java.designPatterns.creational.drinkFactory.factories;

import com.prosto.java.designPatterns.creational.drinkFactory.entities.Drink;
import com.prosto.java.designPatterns.creational.drinkFactory.entities.Tea;

public class TeaFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Tea();
    }
}
