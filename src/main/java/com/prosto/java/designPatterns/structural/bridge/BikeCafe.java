package com.prosto.java.designPatterns.structural.bridge;


public class BikeCafe {

    public static void main(String[] args) {

        Additive milk = new Milk();
        Additive syrup = new Syrup();
        Additive sugar = new Sugar();

        Beverage coffeeWithMilk = new Coffee(milk);
        Beverage coffeeWithSugar = new Coffee(sugar);
        Beverage coffeeWithSyrup = new Coffee(syrup);

        Beverage teaWithSugar = new Tea(sugar);
        Beverage teaWithMilk = new Tea(milk);

        coffeeWithMilk.serve();
        coffeeWithSugar.serve();
        coffeeWithSyrup.serve();

        teaWithSugar.serve();
        teaWithMilk.serve();
    }
}
