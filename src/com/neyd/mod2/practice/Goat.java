package com.neyd.mod2.practice;

import java.util.Random;

/**
 * Created by Женя on 10.11.2015.
 */
public class Goat extends Animal {
    public Goat(int age) {
        super(age);
    }

    @Override
    public int getPriceFood() {
        if(asLive  = true) {
            return 4 * this.age;
        } else return 0;
    }
    @Override
    public int getResource() {
        if(asLive  = true) {
            return 6 * this.age;
        } else return 0;
    }
    public boolean isLive(){
        int randomNumber = new Random(80).nextInt(90);
        if ( this.age <= randomNumber) {
           return asLive = true;
        }
        else return asLive = false;
    }
}
