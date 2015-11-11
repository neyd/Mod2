package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
public class Pig extends Animal {
    public Pig(int age, int priceAnimal, String name) {
        super(age,priceAnimal,name);
    }

    @Override
    public int getPriceFood() {
        if (asLive == 1) {
            return 3 * this.age;
        } else return 0;
    }
    public int getFood(){
        if (asLive == 1){
            return 15 * this.age;
        } else return 0;
    }
    public int getPriceAnimal() {
        if (asLive == 1) {
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
    public int isLive() {
        int randomNumber = (int) (Math.random() * (11)) + 50;
        if (this.age <= 55) {
            asLive = 1;
            return asLive = 1;
        } else {
            return asLive = 0;
        }
    }
}
