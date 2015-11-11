package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
public class Chicken extends Animal {
    public Chicken(int age, int priceAnimal, String name) {
        super(age,priceAnimal,name);
    }

    @Override
    public int getPriceFood() {
        if (asLive == 1) {
            return this.age;
        } else return 0;
    }

    public int getResource() {
        if (asLive == 1) {
            return 2 * this.age;
        } else return 0;
    }
    public int getFood(){
        if (asLive == 1){
            return 5 * this.age;
        } else return 0;
    }
    public int getPriceAnimal() {
        if (asLive == 1) {
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
    public int isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 10;
        if (this.age <= 15) {
            return asLive = 1;
        } else return asLive = 0;
    }
}
