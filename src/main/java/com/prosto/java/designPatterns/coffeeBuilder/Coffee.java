package com.prosto.java.designPatterns.coffeeBuilder;

public record Coffee(
        int espressoInMilliliters,
        int milkInMilliliters,
        int sugarInSpoons,
        int syrupInMilliliters,
        Syrup syrupType,
        Sprinkles sprinkles

) {

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
