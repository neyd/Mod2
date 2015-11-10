package com.neyd.mod2.practice;

import java.util.Scanner;

/**
 * Created by Женя on 03.11.2015.
 */
public class OOPBasicsPractice {

    public static void main(String[] args) {
        int allPrice = 0;
        int allResource = 0;
        int resp;
        int money = 1500;
        int thisday = 1;
        int day = 1;
        Animal[] animals = new Animal[7];
        animals[0] = new Cow(160);
        animals[1] = new Horse(6);
        animals[2] = new Goat(4);
        animals[3] = new Pig(3);
        animals[4] = new Sheep(4);
        animals[5] = new Hare(6);
        animals[6] = new Chicken(2);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < animals.length; i++) {
                animals[i].isLive();
                System.out.println(animals[i].isLive());
            }
            System.out.println("Зарас проходить " + day + " день");
            System.out.println();
            System.out.println("1.Погодувати всіх тварин");
            System.out.println("2.Подивитися скільки ресурсів");
            System.out.println("3.Продати ресурси");
            System.out.println("4.Подивитися скільки грошей");
            System.out.println("5.Продати тварину");
            System.out.println("6.Наступний день");
            System.out.println("7.Закінчити");
            resp = Integer.parseInt(scanner.nextLine());
            if (resp == 1) {
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i].asLive = true) {
                        allPrice = allPrice + animals[i].getPriceFood();
                    }
                }
                for (int i = 0; i < animals.length; i++) {
                    animals[i].isLive();
                    if (animals[i].asLive = true) {
                        if (money >= allPrice) {
                            animals[i].feed();
                            System.out.println(animals[i].asLive);
                            System.out.println(animals[i].isHungry());
                            System.out.println(animals[i].getPriceFood());
                            money = money - animals[i].getPriceFood();
                        }
                    }
                }
                System.out.println("Тварини тепер ситі");
                System.out.println("У вас залишилось " + money + " грн");
                System.out.println(allPrice);
                scanner.nextLine();
            }
            if (resp == 2){
                if (thisday == 1) {
                    for (int i = 0; i < animals.length; i++) {
                        System.out.println(animals[i].getResource());
                        allResource = allResource + animals[i].getResource();
                    }
                } else{
                        System.out.println("Ви вже сьогодні продавали ресурси");
                    }
            System.out.println("У вас зарас " + allResource + " Ресурсів");
            scanner.nextLine();
        }
            if (resp == 3) {
                money = money + (allResource * 4);
                allResource = 0;
                System.out.println("У вас тепер " + money + " грн і  " + allResource + " ресурсів");
                scanner.nextLine();
                thisday = 0;

            }
            if (resp == 4) {
                System.out.println("У вас зарас " + money + " грн");
            }
            if (resp == 5){

            }
            if (resp == 6){

            }
            if (resp == 7) {
                break;
            }
        }
    }
}
