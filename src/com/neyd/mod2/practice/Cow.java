package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
public class Cow extends Animal {
    public Cow(int age, int priceAnimal, String name) {
        super(age,priceAnimal,name);
    }

    @Override
    public int getPriceFood() {
        if (asLive == 1) {
            return 4 * this.age;
        } else return 0;
    }

    @Override
    public int getResource() {
        if (asLive == 1) {
            return 6 * this.age;
        } else return 0;
    }
    public int getFood(){
        if (asLive == 1){
            return 25 * this.age;
        } else return 0;
    }
    public int getPriceAnimal() {
       if (asLive == 1) {
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

    public int isLive() {
        int randomNumber = (int) (Math.random() * (21)) + 110;
        if (this.age <= 120) {
            return asLive = 1;
        } else {
            asLive = 0;
            return asLive = 0;
        }
    }
}
