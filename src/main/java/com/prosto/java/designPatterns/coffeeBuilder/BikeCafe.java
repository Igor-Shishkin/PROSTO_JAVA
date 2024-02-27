package com.prosto.java.designPatterns.coffeeBuilder;

public class BikeCafe {
    public static void main(String[] args) {
        Coffee cappuccino = new Coffee.Builder()
                .withSprinkles(Sprinkles.GRATED_CHOCOLATE)
                .withEspressoInMilliliters(50)
                .withMilkInMilliliters(150)
                .build();
        System.out.println(cappuccino);

        Coffee espresso = new Coffee.Builder()
                .withEspressoInMilliliters(80)
                .build();
        System.out.println(espresso);
    }
}
