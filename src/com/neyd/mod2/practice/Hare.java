package com.neyd.mod2.practice;

import java.util.Random;

/**
 * Created by Женя on 10.11.2015.
 */
public class Hare extends Animal {
    public Hare(int age){
        super(age);
    }
    @Override
    public int getPriceFood() {
        if(asLive  = true) {
            return 4 * this.age;
        } else return 0;
    }
    public boolean isLive(){
        int randomNumber = new Random(10).nextInt(20);
        if ( this.age <= randomNumber) {
           return asLive = true;
        }else return asLive = false;
    }
}
