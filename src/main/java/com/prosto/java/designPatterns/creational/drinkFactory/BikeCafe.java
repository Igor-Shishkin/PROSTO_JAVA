package com.prosto.java.designPatterns.creational.drinkFactory;

import com.prosto.java.designPatterns.creational.drinkFactory.entities.Drink;
import com.prosto.java.designPatterns.creational.drinkFactory.factories.CoffeeFactory;
import com.prosto.java.designPatterns.creational.drinkFactory.factories.DrinkFactory;
import com.prosto.java.designPatterns.creational.drinkFactory.factories.LemonadeFactory;
import com.prosto.java.designPatterns.creational.drinkFactory.factories.TeaFactory;

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
