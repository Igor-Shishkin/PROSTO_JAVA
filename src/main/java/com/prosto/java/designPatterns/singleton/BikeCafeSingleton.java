package com.prosto.java.designPatterns.singleton;

public class BikeCafeSingleton {
    public static void main(String[] args) {
//        LogByClass logOne = LogByClass.getInstance();
//        LogByClass logTwo = LogByClass.getInstance();
//
//        logOne.addInfo("Bought a cup of cappuccino");
//        logOne.addInfo("Bought a cup of cappuccino");
//
//        logTwo.addInfo("Bought a cup of espresso");
//
//        System.out.println(logTwo.showLog());

        LogByEnum enumLog = LogByEnum.INSTANCE;
        enumLog.putMoney(3.5);
        enumLog.putMoney(3.1);
        LogByEnum.INSTANCE.putMoney(10);

        System.out.println(LogByEnum.INSTANCE.showProfit());
    }
}
