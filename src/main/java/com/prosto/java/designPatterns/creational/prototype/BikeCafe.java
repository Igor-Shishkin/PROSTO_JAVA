package com.prosto.java.designPatterns.creational.prototype;

public class BikeCafe {
    public static void main(String[] args) {
        Coffee latteOne = new Coffee.Builder()
                .withEspressoInMilliliters(60)
                .withMilkInMilliliters(180)
                .withSyrupType(Syrup.WHISKEY)
                .withSyrupInMilliliters(30)
                .withSprinkles(Sprinkles.GRATED_CHOCOLATE)
                .build();

        CoffeeFactory coffeeFactory = new CoffeeFactory(latteOne);

        Coffee latteTwo = coffeeFactory.createCopy();

//        System.out.println("This is ONE mug of coffee: " +
//                (latteOne == latteTwo));
//        System.out.println("These coffee mugs are the same: " +
//                latteOne.equals(latteTwo));

        Coffee latteThree = latteOne.createCoffeeWithSugar(3);
        System.out.println(latteThree);
    }







}
