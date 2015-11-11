package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
public class Sheep extends Animal {
    public Sheep(int age, int priceAnimal, String name) {
        super(age,priceAnimal,name);
    }

    @Override
    public int getPriceFood() {
        if (asLive == 1) {
            return 2 * this.age;
        } else return 0;
    }
    public int getPriceAnimal() {
        if (asLive == 1) {
            if (this.age <= 30) {
                return priceAnimal * 2;
            } else if (this.age <= 38) {
                return priceAnimal;
            } else if (this.age <= 43) {
                return (int) Math.floor(priceAnimal / 2);
            } else if (this.age <= 50) {
                return (int) Math.floor(priceAnimal / 4);
            } else return 0;
        } else return 0;
    }
    public int isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 55;
        if (this.age <= 60) {
            return asLive = 1;
        } else return asLive = 0;
    }
}
