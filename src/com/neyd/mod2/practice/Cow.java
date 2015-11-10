package com.neyd.mod2.practice;
import java.util.Random;
/**
 * Created by Женя on 03.11.2015.
 */
public class Cow extends Animal {
    public Cow(int age) {
        super(age);
    }
    public boolean isLive(){
        int randomNumber = new Random(110).nextInt(130);
        if ( this.age <= randomNumber) {
            return asLive = true;
        } else{
            asLive = false;
            return asLive = false;
        }
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
}
