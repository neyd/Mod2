package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
public class Cow extends Animal {
    public Cow(int age, int priceAnimal, String name) {
        super(age, priceAnimal, name);
    }

    public static final int FEEDING_COST_PER_MOUNTH_OF_AGE = 4;
    public static final int PRODUCES_RESOURCES_COST_PER_MOUNTH_OF_AGE = 6;
    public static final int PROVIDES_RESOURCES_WHEN_THROWING_FOOD = 25;

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

    public int getFood() {
        if (asLive != false) {
            return PROVIDES_RESOURCES_WHEN_THROWING_FOOD * this.age;
        } else return 0;
    }

    public int getPriceAnimal() {
        if (asLive != false) {
            if (this.age <= 60) {
                return priceAnimal * 2;
            } else if (this.age <= 80) {
                return priceAnimal;
            } else if (this.age <= 90) {
                return (int) Math.floor(priceAnimal / 2);
            } else if (this.age <= 105) {
                return (int) Math.floor(priceAnimal / 4);
            } else return 0;
        } else return 0;
    }

    public boolean isLive() {
        int randomNumber = (int) (Math.random() * (21)) + 110;
        if (this.age <= 120) {
            return asLive = true;
        } else {
            asLive = false;
            return asLive = false;
        }
    }
}
