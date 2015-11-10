package com.neyd.mod2.practice;

import java.util.Random;

/**
 * Created by Женя on 03.11.2015.
 */
public class Chicken extends Animal {
    public Chicken(int age) {
        super(age);
    }
    @Override
    public int getPriceFood() {
        if(asLive  = true) {
            return this.age;
        } else return 0;
    }
    public int getResource() {
        if(asLive  = true) {
            return 2 * this.age;
        }else return 0;
    }
    public boolean isLive(){
        int randomNumber = new Random(10).nextInt(20);
        if ( this.age <= randomNumber) {
           return asLive = true;
        }
        else return asLive = false;
    }
}
