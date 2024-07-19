package com.prosto.java.designPatterns.structural.decotator;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class BikeCafe {
    public static void main(String[] args) {

        Coffee coffee = new WhiskySyrup
                (new FoamedMilk
                (new ChocolateCrumbs
                (new Espresso(50))));
        System.out.println(coffee.makeCoffee());









        try(var input = new BufferedInputStream(new FileInputStream(args[0]))) {
            //TODO:
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
