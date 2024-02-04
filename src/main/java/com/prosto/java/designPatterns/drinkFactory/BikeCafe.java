package com.prosto.java.designPatterns.drinkFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BikeCafe {

    public static void main(String[] args) {
        DrinkFactory drinkFactory = getDrinkFactoryByName("beer");

        Drink drink = drinkFactory.createDrink();
        drink.getDrink();
    }

    static DrinkFactory getDrinkFactoryByName(String name) {
        switch (name.toLowerCase()) {
            case "coffee" : return new CoffeeFactory();
            case "tea" : return new TeaFactory();
            case "lemonade" : return new LemonadeFactory();
            default: throw new RuntimeException("We don't have this type of drink");
        }
    }
}
