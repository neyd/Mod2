package com.neyd.mod2.practice1;

/**
 * Created by Женя on 03.11.2015.
 */
public class Chicken extends Animal {
    public Chicken(int age, int priceAnimal, String name) {
        super(age, priceAnimal, name);
    }
    public static final int PRODUCES_RESOURCES_COST_PER_MOUNTH_OF_AGE = 2;
    public static final int PROVIDES_RESOURCES_WHEN_THROWING_FOOD = 5;
    @Override
    public int getPriceFood() {
        if (asLive != false) {
            return this.age;
        } else return 0;
    }

    public int getResource() {
        if (asLive != false) {
            return PRODUCES_RESOURCES_COST_PER_MOUNTH_OF_AGE * this.age;
        } else return 0;
    }

    public int getFood() {
        if (asLive != false) {
            return PROVIDES_RESOURCES_WHEN_THROWING_FOOD * this.age;
        } else return 0;
    }

    public int getPriceAnimal() {
        if (asLive != false) {
            if (this.age <= 8) {
                return priceAnimal * 2;
            } else if (this.age <= 10) {
                return priceAnimal;
            } else if (this.age <= 12) {
                return (int) Math.floor(priceAnimal / 2);
            } else if (this.age <= 13) {
                return (int) Math.floor(priceAnimal / 4);
            } else return 0;
        } else return 0;
    }

    public boolean isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 10;
        if (this.age <= 15) {
            return asLive = true;
        } else return asLive = false;
    }
}
