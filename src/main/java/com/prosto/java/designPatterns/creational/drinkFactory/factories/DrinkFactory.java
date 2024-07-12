package com.prosto.java.designPatterns.creational.drinkFactory.factories;

import com.prosto.java.designPatterns.creational.drinkFactory.entities.Drink;

public interface DrinkFactory {
    Drink createDrink();
}
