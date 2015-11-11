package com.neyd.mod2.practice;

/**
 * Created by Женя on 10.11.2015.
 */
public class Goat extends Animal {
    public Goat(int age, int priceAnimal, String name) {
        super(age,priceAnimal,name);
    }

    @Override
    public int getPriceFood() {
        if(asLive == 1) {
            return 4 * this.age;
        } else return 0;
    }
    @Override
    public int getResource() {
        if(asLive == 1) {
            return 6 * this.age;
        } else return 0;
    }
    public int getPriceAnimal() {
        if (asLive == 1) {
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
    public int isLive(){
        int randomNumber = (int) (Math.random() * (11)) + 80;
        if ( this.age <= 85) {
           return asLive = 1;
        }
        else return asLive = 0;
    }
}
