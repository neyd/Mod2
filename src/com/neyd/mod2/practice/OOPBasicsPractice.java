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
        int daysee = 0;
        int day = 1;
        Animal[] animals = new Animal[7];
        animals[0] = new Cow(25, 200, "Корова");
        animals[1] = new Horse(10, 150, "Кінь");
        animals[2] = new Goat(4, 100, "Коза");
        animals[3] = new Pig(3, 50, "Свиня");
        animals[4] = new Sheep(4, 50, "Вівця");
        animals[5] = new Hare(6, 25, "Заєць");
        animals[6] = new Chicken(2, 15, "Курка");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animals.length; i++) {
            animals[i].isLive();
            System.out.println(animals[i].isLive() + " - " + animals[i].name);
        }
        System.out.println("Зарас проходить " + day + " день");
        while (true) {
            System.out.println();
            System.out.println("У Вас грошей - " + money + " грн, і - " + allResource + " ресурсів");
            System.out.println("1.Погодувати всіх тварин");
            System.out.println("2.Подивитися скільки ресурсів");
            System.out.println("3.Продати ресурси");
            System.out.println("4.Подивитися скільки грошей");
            System.out.println("5.Продати тварину");
            System.out.println("6.Пустити на їжу");
            System.out.println("7.Наступний день");
            System.out.println("8.Закінчити");
            resp = Integer.parseInt(scanner.nextLine());
            if (resp == 1) {
                for (int i = 0; i < animals.length; i++) {
                    allPrice = allPrice + animals[i].getPriceFood();
                }
                for (int i = 0; i < animals.length; i++) {
                    if (money >= allPrice) {
                        animals[i].feed();
                        System.out.println(animals[i].isHungry() + " - " + animals[i].name);
                        System.out.println("Ціна їжі - " + animals[i].getPriceFood());
                        money = money - animals[i].getPriceFood();

                    }
                }
                System.out.println("Тварини тепер ситі");
                System.out.println(allPrice + " - загальна сумма");
                System.out.println("У вас залишилось " + money + " грн");
                allPrice = 0;
                scanner.nextLine();
            } else if (resp == 2) {
                if (thisday == 1) {
                    for (int i = 0; i < animals.length; i++) {
                        System.out.println(animals[i].getResource() + " - " + animals[i].name);
                        allResource = allResource + animals[i].getResource();
                        thisday = 0;
                        daysee = 1;
                    }
                } else {
                    System.out.println("Ви вже дивилися ресурси сьогодні");
                }
                System.out.println("У вас зарас " + allResource + " Ресурсів");
                scanner.nextLine();
            } else if (resp == 3) {
                if (daysee == 1) {
                    money = money + (allResource * 4);
                    allResource = 0;
                    System.out.println();
                    System.out.println("У вас тепер " + money + " грн і  " + allResource + " ресурсів");
                    scanner.nextLine();
                    thisday = 0;
                    daysee = 0;
                } else {
                    System.out.println("Ви ще не дивилися скільки ресурсів, або уже продали їх");
                    scanner.nextLine();
                }
            } else if (resp == 4) {
                System.out.println("У вас зарас " + money + " грн");
                scanner.nextLine();
            } else if (resp == 5) {
                for (int i = 0; i < animals.length; i++) {
                    System.out.println((i + 1) + "." + animals[i].name + " - " + animals[i].asLive);
                }
                resp = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < animals.length; i++) {
                    if (resp == i + 1) {
                        money = money + animals[i].getPriceAnimal();
                        System.out.println("Ви продали цю тварину за " + animals[i].getPriceAnimal() + " і зараз у вас " + money + " ");
                        animals[i].setAsLive(0);
                    }
                }
            } else if (resp == 6) {
                System.out.println("1." + animals[0].name + " - " + animals[0].asLive);
                System.out.println("2." + animals[3].name + " - " + animals[3].asLive);
                System.out.println("3." + animals[5].name + " - " + animals[5].asLive);
                System.out.println("4." + animals[6].name + " - " + animals[6].asLive);
                resp = Integer.parseInt(scanner.nextLine());
                if (resp == 1) {
                    animals[0].getFood();
                    allResource = allResource + animals[0].getFood();
                    System.out.println("Ви отримали " + animals[0].getFood() + " ресурсів");
                    animals[0].setAsLive(0);
                    daysee = 1;
                    thisday = 0;
                } else if (resp == 2) {
                    animals[3].getFood();
                    allResource = allResource + animals[3].getFood();
                    System.out.println("Ви отримали " + animals[3].getFood() + " ресурсів");
                    animals[3].setAsLive(0);
                    daysee = 1;
                    thisday = 0;
                } else if (resp == 3) {
                    animals[5].getFood();
                    allResource = allResource + animals[5].getFood();
                    System.out.println("Ви отримали " + animals[5].getFood() + " ресурсів");
                    animals[5].setAsLive(0);
                    daysee = 1;
                    thisday = 0;
                } else if (resp == 4) {
                    animals[6].getFood();
                    allResource = allResource + animals[6].getFood();
                    System.out.println("Ви отримали " + animals[6].getFood() + " ресурсів");
                    animals[6].setAsLive(0);
                    daysee = 1;
                    thisday = 0;
                }
            } else if (resp == 7) {

            } else if (resp == 8) {
                break;
            }
        }
    }
}
