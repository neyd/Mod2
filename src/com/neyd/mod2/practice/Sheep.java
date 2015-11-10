package com.neyd.mod2.practice;

import java.util.Random;

/**
 * Created by Женя on 03.11.2015.
 */
public class Sheep extends Animal{
    public Sheep(int age) {
        super(age);
    }
    @Override
    public int getPriceFood() {
        if(asLive  = true) {
            return 2 * this.age;
        } else return 0;
    }
    public boolean isLive(){
        int randomNumber = new Random(55).nextInt(65);
        if ( this.age <= randomNumber) {
           return asLive = true;
        }else return asLive = false;
    }
}
