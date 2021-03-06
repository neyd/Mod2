package com.neyd.mod2.practice1;

/**
 * Created by Женя on 03.11.2015.
 */
public class Pig extends Animal {
    public Pig(int age, int priceAnimal, String name) {
        super(age, priceAnimal, name);
    }

    public static final int FEEDING_COST_PER_MOUNTH_OF_AGE = 3;
    public static final int PROVIDES_RESOURCES_WHEN_THROWING_FOOD = 15;

    @Override
    public int getPriceFood() {
        if (asLive != false) {
            return FEEDING_COST_PER_MOUNTH_OF_AGE * this.age;
        } else return 0;
    }

    public int getFood() {
        if (asLive != false) {
            return PROVIDES_RESOURCES_WHEN_THROWING_FOOD * this.age;
        } else return 0;
    }

    public int getPriceAnimal() {
        if (asLive != false) {
            if (this.age <= 27) {
                return priceAnimal * 2;
            } else if (this.age <= 35) {
                return priceAnimal;
            } else if (this.age <= 40) {
                return (int) Math.floor(priceAnimal / 2);
            } else if (this.age <= 45) {
                return (int) Math.floor(priceAnimal / 4);
            } else return 0;
        } else return 0;
    }

    public boolean isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 50;
        if (this.age <= 55) {
            asLive = true;
            return asLive = true;
        } else {
            return asLive = false;
        }
    }
}
