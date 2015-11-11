package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
public class Horse extends Animal {
    public Horse(int age, int priceAnimal, String name) {
        super(age, priceAnimal, name);
    }
    public static final int FEEDING_COST_PER_MOUNTH_OF_AGE = 4;
    @Override
    public int getPriceFood() {
        if (asLive == 1) {
            return FEEDING_COST_PER_MOUNTH_OF_AGE * this.age;
        } else return 0;
    }

    public int getPriceAnimal() {
        if (asLive == 1) {
            if (this.age <= 53) {
                return priceAnimal * 2;
            } else if (this.age <= 70) {
                return priceAnimal;
            } else if (this.age <= 80) {
                return (int) Math.floor(priceAnimal / 2);
            } else if (this.age <= 95) {
                return (int) Math.floor(priceAnimal / 4);
            } else return 0;
        } else return 0;
    }

    public int isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 100;
        if (this.age <= 105) {
            return asLive = 1;
        } else return asLive = 0;
    }
}
