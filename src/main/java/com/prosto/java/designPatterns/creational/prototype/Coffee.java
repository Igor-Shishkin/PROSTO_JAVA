package com.prosto.java.designPatterns.creational.prototype;

import java.util.Objects;

public class Coffee implements Copyable, CoffeeCopyWithSugar{
    int espressoInMilliliters;
    int milkInMilliliters;
    int sugarInSpoons;
    int syrupInMilliliters;
    Syrup syrupType;
    Sprinkles sprinkles ;


    public Coffee(int espressoInMilliliters, int milkInMilliliters, int sugarInSpoons, int syrupInMilliliters,
                  Syrup syrupType, Sprinkles sprinkles) {
        this.espressoInMilliliters = espressoInMilliliters;
        this.milkInMilliliters = milkInMilliliters;
        this.sugarInSpoons = sugarInSpoons;
        this.syrupInMilliliters = syrupInMilliliters;
        this.syrupType = syrupType;
        this.sprinkles = sprinkles;
    }

    @Override
    public Object createCopy() {
        return new Coffee(this.espressoInMilliliters,
                this.milkInMilliliters,
                this.sugarInSpoons,
                this.syrupInMilliliters,
                this.syrupType,
                this.sprinkles);
    }
    @Override
    public Coffee createCoffeeWithSugar(int sugar) {
        return new Coffee(this.espressoInMilliliters,
                this.milkInMilliliters,
                sugar,
                this.syrupInMilliliters,
                this.syrupType,
                this.sprinkles);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return espressoInMilliliters == coffee.espressoInMilliliters && milkInMilliliters == coffee.milkInMilliliters && sugarInSpoons == coffee.sugarInSpoons && syrupInMilliliters == coffee.syrupInMilliliters && syrupType == coffee.syrupType && sprinkles == coffee.sprinkles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(espressoInMilliliters, milkInMilliliters, sugarInSpoons, syrupInMilliliters, syrupType, sprinkles);
    }




    public static class Builder {
            int espressoInMilliliters;
            int milkInMilliliters;
            int sugarInSpoons;
            int syrupInMilliliters;
            Syrup syrupType;
            Sprinkles sprinkles;
            public Builder withEspressoInMilliliters (int espressoInMilliliters){
                this.espressoInMilliliters = espressoInMilliliters;
                return this;
            }
            public Builder withMilkInMilliliters (int milkInMilliliters){
                this.milkInMilliliters = milkInMilliliters;
                return this;
            }
            public Builder withSugarInSpoons (int sugarInSpoons){
                this.sugarInSpoons = sugarInSpoons;
                return this;
            }
            public Builder withSyrupInMilliliters (int syrupInMilliliters){
                this.syrupInMilliliters = syrupInMilliliters;
                return this;
            }
            public Builder withSyrupType (Syrup syrupType){
                this.syrupType = syrupType;
                return this;
            }
            public Builder withSprinkles (Sprinkles sprinkles){
                this.sprinkles = sprinkles;
                return this;
            }
            public Coffee build() {
                return new Coffee(this.espressoInMilliliters,
                        this.milkInMilliliters,
                        this.sugarInSpoons,
                        this.syrupInMilliliters,
                        this.syrupType,
                        this.sprinkles);
            }
        }

        @Override
        public String toString() {
            return "Coffee{" +
                    "espressoInMilliliters=" + espressoInMilliliters +
                    ",\nmilkInMilliliters=" + milkInMilliliters +
                    ",\nsugarInSpoons=" + sugarInSpoons +
                    ",\nsyrupInMilliliters=" + syrupInMilliliters +
                    ",\nsyrupType=" + syrupType +
                    ",\nsprinkles=" + sprinkles +
                    '}';
        }
}
