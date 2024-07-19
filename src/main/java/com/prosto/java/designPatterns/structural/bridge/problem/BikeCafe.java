package com.prosto.java.designPatterns.structural.bridge.problem;

public class BikeCafe {
    public static void main(String[] args) {
        Cocoa cocoaWithMilk = new CocoaWithMilk();
        Coffee coffeeWithMilk = new CoffeeWithMilk();
        Tea teaWithMilk = new TeaWithMilk();

        cocoaWithMilk.serve();
        coffeeWithMilk.serve();
        teaWithMilk.serve();
    }
}
