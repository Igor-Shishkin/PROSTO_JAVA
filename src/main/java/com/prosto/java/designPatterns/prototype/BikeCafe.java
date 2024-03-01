package com.prosto.java.designPatterns.prototype;

public class BikeCafe {
    public static void main(String[] args) {

        Coffee latte = new Coffee.Builder()
                .withEspressoInMilliliters(40)
                .withMilkInMilliliters(180)
                .withSyrupInMilliliters(25)
                .withSyrupType(Syrup.WHISKEY)
                .withSprinkles(Sprinkles.CINNAMON)
                .build();

        CoffeeFactory latteFactory = new CoffeeFactory(latte);

        Coffee latteCopy = latteFactory.createCopy();

        System.out.println("This is ONE mug of coffee: " +
                (latteCopy == latte));
        System.out.println("\n");
        System.out.println("These coffee mugs are the same: " +
                latte.equals(latteCopy));

    }
}
