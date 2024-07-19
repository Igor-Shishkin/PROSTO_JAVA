package com.prosto.java.designPatterns.structural.decotator;

public final class Espresso implements Coffee {

    private final int volumeInMilliliters;

    public Espresso(int volumeInMilliliters) {
        this.volumeInMilliliters = volumeInMilliliters;
    }

    @Override
    public String makeCoffee() {
        return String.format("Pour %d milliliters of strong espresso.\n", volumeInMilliliters);
    }
}
