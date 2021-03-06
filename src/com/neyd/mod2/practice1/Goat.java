package com.neyd.mod2.practice1;

/**
 * Created by Женя on 10.11.2015.
 */
public class Goat extends Animal {
    public Goat(int age, int priceAnimal, String name) {
        super(age, priceAnimal, name);
    }

    public static final int FEEDING_COST_PER_MOUNTH_OF_AGE = 4;
    public static final int PRODUCES_RESOURCES_COST_PER_MOUNTH_OF_AGE = 6;

    @Override
    public int getPriceFood() {
        if (asLive != false) {
            return FEEDING_COST_PER_MOUNTH_OF_AGE * this.age;
        } else return 0;
    }

    @Override
    public int getResource() {
        if (asLive != false) {
            return PRODUCES_RESOURCES_COST_PER_MOUNTH_OF_AGE * this.age;
        } else return 0;
    }

    public int getPriceAnimal() {
        if (asLive != false) {
            if (this.age <= 43) {
                return priceAnimal * 2;
            } else if (this.age <= 58) {
                return priceAnimal;
            } else if (this.age <= 65) {
                return (int) Math.floor(priceAnimal / 2);
            } else if (this.age <= 75) {
                return (int) Math.floor(priceAnimal / 4);
            } else return 0;
        } else return 0;
    }

    public boolean isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 80;
        if (this.age <= 85) {
            return asLive = true;
        } else return asLive = false;
    }
}
