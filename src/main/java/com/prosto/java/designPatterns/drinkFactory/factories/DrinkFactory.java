package com.prosto.java.designPatterns.drinkFactory.factories;

import com.prosto.java.designPatterns.drinkFactory.entities.Drink;

public interface DrinkFactory {
    Drink createDrink();
}
