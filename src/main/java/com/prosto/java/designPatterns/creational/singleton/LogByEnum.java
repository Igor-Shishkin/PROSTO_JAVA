package com.prosto.java.designPatterns.creational.singleton;

public enum LogByEnum {
    INSTANCE;

    private double moneyCounter = 0.0;

    public void putMoney(double amountOfMoney) {
        moneyCounter += amountOfMoney;
    }
    public String showProfit() {
        return String.format("Profit per day: %.2f%n", moneyCounter);
    }
}
