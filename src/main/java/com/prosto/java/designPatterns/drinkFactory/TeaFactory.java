package com.prosto.java.designPatterns.drinkFactory;

public class TeaFactory implements DrinkFactory{
    @Override
    public Drink createDrink() {
        return new Tea();
    }
}
