package com.neyd.mod2.practice;

import java.util.Random;

/**
 * Created by Женя on 03.11.2015.
 */
public class Horse extends Animal {
    public Horse(int age) {
        super(age);
    }
    @Override
    public int getPriceFood() {
        if(asLive  = true) {
            return 4 * this.age;
        }
        else return 0;
    }
    public boolean isLive(){
        int randomNumber = new Random(100).nextInt(110);
        if ( this.age <= randomNumber) {
            return asLive = true;
        }
        else return asLive = false;
    }
}
