package com.neyd.mod2.practice;

import java.util.Random;

/**
 * Created by Женя on 03.11.2015.
 */
public class Pig extends Animal {
    public Pig(int age) {
        super(age);
    }
    @Override
    public int getPriceFood() {
        if(asLive  = true) {
            return 3 * this.age;
        } else return 0;
    }
    public boolean isLive(){
        int randomNumber = new Random(50).nextInt(60);
        if ( this.age <= randomNumber) {
            asLive = true;
            return asLive = true;
        }
        else{
            return asLive = false;
        }
    }
}
