package com.neyd.mod2.practice;

/**
 * Created by Женя on 03.11.2015.
 */
abstract public class Animal {
    private boolean asHungry;
    protected boolean asLive;
    protected int age;
    protected int resource;
    protected int priceAnimal;
    protected String name;
    int population = 7;

    public Animal(int age, int priceAnimal, String name) {
        this.age = age;
        this.priceAnimal = priceAnimal;
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFood() {
        return resource;
    }

    public boolean isLive() {
        return asLive;
    }

    public void setAsLive(boolean asLive) {
        this.asLive = asLive;
    }

    public int getPriceAnimal() {
        return priceAnimal;
    }

    public void setPriceAnimal(int priceAnimal) {
        this.priceAnimal = priceAnimal;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void setHungry(boolean asHungry) {
        this.asHungry = true;
    }

    abstract public int getPriceFood();

    public boolean isHungry() {
        return asHungry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed() {
        asHungry = false;
    }

    public int getAge() {
        return age;
    }
}
