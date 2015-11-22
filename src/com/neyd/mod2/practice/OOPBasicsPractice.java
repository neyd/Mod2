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
        int money = 2000;
        int mounth = 1;
        int day = 1;
        boolean thisday = true;
        boolean daysee = false;
        String asHungryString = "Тварини голодні";
        Animal[] animals = new Animal[50];
        animals[0] = new Cow(20, 200, "Корова");
        animals[1] = new Horse(25, 150, "Кінь");
        animals[2] = new Goat(35, 100, "Коза");
        animals[3] = new Pig(33, 50, "Свиня");
        animals[4] = new Sheep(20, 50, "Вівця");
        animals[5] = new Hare(3, 25, "Заєць");
        animals[6] = new Chicken(6, 15, "Курка");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < animals[0].getPopulation(); i++) {
            animals[i].isLive();
            System.out.println(animals[i].isLive() + " - " + animals[i].name + " - " + animals[i].getAge());
        }
        System.out.println("Зарас проходить " + day + " день");
        while (true) {
            System.out.println();
            System.out.println("У Вас грошей - " + money + " грн, і - " + allResource + " ресурсів");
            System.out.println("1.Погодувати всіх тварин        " + asHungryString);
            System.out.println("2.Подивитися скільки ресурсів");
            System.out.println("3.Продати ресурси");
            System.out.println("4.Подивитися скільки грошей");
            System.out.println("5.Продати тварину");
            System.out.println("6.Пустити на їжу");
            System.out.println("7.Купити тварин");
            System.out.println("8.Наступний день");
            System.out.println("9.Закінчити");
            resp = Integer.parseInt(scanner.nextLine());
            if (resp == 1) {
                for (int i = 0; i < animals[0].getPopulation(); i++) {
                    if (money >= animals[i].getPriceFood() && animals[i].asLive == true) {
                        allPrice = allPrice + animals[i].getPriceFood();
                        animals[i].feed();
                        System.out.println(animals[i].isHungry() + " - " + animals[i].name + " - " + animals[i].getAge());
                        System.out.println("Ціна їжі - " + animals[i].getPriceFood());
                        money = money - animals[i].getPriceFood();
                        asHungryString = "";
                    }
                }
                System.out.println("Тварини тепер ситі");
                System.out.println(allPrice + " - загальна сумма");
                System.out.println("У вас залишилось " + money + " грн");
                allPrice = 0;
                scanner.nextLine();
            } else if (resp == 2) {
                if (thisday != false) {
                    for (int i = 0; i < animals[0].getPopulation(); i++) {
                        System.out.println(animals[i].getResource() + " - " + animals[i].name);
                        allResource = allResource + animals[i].getResource();
                        thisday = false;
                        daysee = true;
                    }
                } else {
                    System.out.println("Ви вже дивилися ресурси сьогодні");
                }
                System.out.println("У вас зарас " + allResource + " ресурсів");
                scanner.nextLine();
            } else if (resp == 3) {
                if (daysee != false) {
                    money = money + (allResource * 2);
                    allResource = 0;
                    System.out.println();
                    System.out.println("У вас тепер " + money + " грн і  " + allResource + " ресурсів");
                    scanner.nextLine();
                    thisday = false;
                    daysee = false;
                } else {
                    System.out.println("Ви ще не дивилися скільки ресурсів, або уже продали їх");
                    scanner.nextLine();
                }
            } else if (resp == 4) {
                System.out.println("У вас зарас " + money + " грн");
                scanner.nextLine();
            } else if (resp == 5) {
                for (int i = 0; i < animals[0].getPopulation(); i++) {
                    System.out.println((i + 1) + "." + animals[i].name + " - " + animals[i].asLive);
                }
                resp = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < animals[0].getPopulation(); i++) {
                    if (resp == i + 1) {
                        money = money + animals[i].getPriceAnimal();
                        System.out.println("Ви продали цю тварину за " + animals[i].getPriceAnimal() + " і зараз у вас " + money + " ");
                        animals[i].setAsLive(false);
                    }
                }
            } else if (resp == 6) {
                for (int i = 0; i < animals[0].population; i++) {
                    if (animals[i].getFood() != 0) {
                        System.out.println((i + 1) + "." + animals[i].name + " - " + animals[i].asLive);
                    }
                }
                resp = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < animals[0].population; i++) {
                    if (resp == i + 1) {
                        animals[i].getFood();
                        allResource = allResource + animals[i].getFood();
                        System.out.println("Ви отримали " + animals[i].getFood() + " ресурсів");
                        animals[i].setAsLive(false);
                        daysee = true;
                        thisday = false;
                    }
                }
            } else if (resp == 7) {
                for (int i = 0; i < 7; i++) {
                    System.out.println((i + 1) + "." + animals[i].name);
                }
                resp = Integer.parseInt(scanner.nextLine());
                if (resp == 1) {
                    int mounth1 = (int) (Math.random() * (100));
                    int mounth2 = (int) (Math.random() * (100));
                    int mounth3 = (int) (Math.random() * (100));
                    System.out.println("1." + mounth1 + " місяці. Ціна - " + mounth1 * 50);
                    System.out.println("2." + mounth2 + " місяці. Ціна - " + mounth2 * 50);
                    System.out.println("3." + mounth3 + " місяці. Ціна - " + mounth3 * 50);
                    resp = Integer.parseInt(scanner.nextLine());
                    if (resp == 1) {
                        animals[animals[0].getPopulation()] = new Cow(mounth1, mounth1 * 50, "Корова");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth1 * 50;
                        animals[0].population++;
                        System.out.println("ви купили корову якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 2) {
                        animals[animals[0].getPopulation()] = new Cow(mounth2, mounth2 * 50, "Корова");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth2 * 50;
                        animals[0].population++;
                        System.out.println("ви купили корову якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 3) {
                        animals[animals[0].getPopulation()] = new Cow(mounth3, mounth3 * 50, "Корова");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth3 * 50;
                        animals[0].population++;
                        System.out.println("ви купили корову якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                        scanner.nextLine();
                    }
                } else if (resp == 2) {
                    int mounth1 = (int) (Math.random() * (95));
                    int mounth2 = (int) (Math.random() * (95));
                    int mounth3 = (int) (Math.random() * (95));
                    System.out.println("1." + mounth1 + " місяців. Ціна - " + mounth1 * 50);
                    System.out.println("2." + mounth2 + " місяців. Ціна - " + mounth2 * 50);
                    System.out.println("3." + mounth3 + " місяців. Ціна - " + mounth3 * 50);
                    resp = Integer.parseInt(scanner.nextLine());
                    if (resp == 1) {
                        animals[animals[0].getPopulation()] = new Horse(mounth1, mounth1 * 50, "Кінь");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth1 * 50;
                        animals[0].population++;
                        System.out.println("ви купили коня якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 2) {
                        animals[animals[0].getPopulation()] = new Horse(mounth2, mounth2 * 50, "Кінь");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth2 * 50;
                        animals[0].population++;
                        System.out.println("ви купили коня якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 3) {
                        animals[animals[0].getPopulation()] = new Horse(mounth3, mounth3 * 50, "Кінь");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth3 * 50;
                        animals[0].population++;
                        System.out.println("ви купили коня якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                        scanner.nextLine();
                    }
                } else if (resp == 3) {
                    int mounth1 = (int) (Math.random() * (75));
                    int mounth2 = (int) (Math.random() * (75));
                    int mounth3 = (int) (Math.random() * (75));
                    System.out.println("1." + mounth1 + " місяці. Ціна - " + mounth1 * 50);
                    System.out.println("2." + mounth2 + " місяці. Ціна - " + mounth2 * 50);
                    System.out.println("3." + mounth3 + " місяці. Ціна - " + mounth3 * 50);
                    resp = Integer.parseInt(scanner.nextLine());
                    if (resp == 1) {
                        animals[animals[0].getPopulation()] = new Goat(mounth1, mounth1 * 50, "Коза");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth1 * 50;
                        animals[0].population++;
                        System.out.println("ви купили козу якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 2) {
                        animals[animals[0].getPopulation()] = new Goat(mounth2, mounth2 * 50, "Коза");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth2 * 50;
                        animals[0].population++;
                        System.out.println("ви купили козу якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 3) {
                        animals[animals[0].getPopulation()] = new Goat(mounth3, mounth3 * 50, "Коза");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth3 * 50;
                        animals[0].population++;
                        System.out.println("ви купили козу якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                        scanner.nextLine();
                    }
                } else if (resp == 4) {
                    int mounth1 = (int) (Math.random() * (45));
                    int mounth2 = (int) (Math.random() * (45));
                    int mounth3 = (int) (Math.random() * (45));
                    System.out.println("1." + mounth1 + " місяці. Ціна - " + mounth1 * 50);
                    System.out.println("2." + mounth2 + " місяці. Ціна - " + mounth2 * 50);
                    System.out.println("3." + mounth3 + " місяці. Ціна - " + mounth3 * 50);
                    resp = Integer.parseInt(scanner.nextLine());
                    if (resp == 1) {
                        animals[animals[0].getPopulation()] = new Pig(mounth1, mounth1 * 50, "Свиня");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth1 * 50;
                        animals[0].population++;
                        System.out.println("ви купили свиню якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 2) {
                        animals[animals[0].getPopulation()] = new Pig(mounth2, mounth2 * 50, "Свиня");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth2 * 50;
                        animals[0].population++;
                        System.out.println("ви купили свиню якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 3) {
                        animals[animals[0].getPopulation()] = new Pig(mounth3, mounth3 * 50, "Свиня");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth3 * 50;
                        animals[0].population++;
                        System.out.println("ви купили свиню якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                        scanner.nextLine();
                    }
                } else if (resp == 5) {
                    int mounth1 = (int) (Math.random() * (50));
                    int mounth2 = (int) (Math.random() * (50));
                    int mounth3 = (int) (Math.random() * (50));
                    System.out.println("1." + mounth1 + " місяці. Ціна - " + mounth1 * 50);
                    System.out.println("2." + mounth2 + " місяці. Ціна - " + mounth2 * 50);
                    System.out.println("3." + mounth3 + " місяці. Ціна - " + mounth3 * 50);
                    resp = Integer.parseInt(scanner.nextLine());
                    if (resp == 1) {
                        animals[animals[0].getPopulation()] = new Sheep(mounth1, mounth1 * 50, "Вівця");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth1 * 50;
                        animals[0].population++;
                        System.out.println("ви купили вівцю якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 2) {
                        animals[animals[0].getPopulation()] = new Sheep(mounth2, mounth2 * 50, "Вівця");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth2 * 50;
                        animals[0].population++;
                        System.out.println("ви купили вівцю якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 3) {
                        animals[animals[0].getPopulation()] = new Sheep(mounth3, mounth3 * 50, "Вівця");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth3 * 50;
                        animals[0].population++;
                        System.out.println("ви купили вівцю якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                        scanner.nextLine();
                    }
                } else if (resp == 6) {
                    int mounth1 = (int) (Math.random() * (13));
                    int mounth2 = (int) (Math.random() * (13));
                    int mounth3 = (int) (Math.random() * (13));
                    System.out.println("1." + mounth1 + " місяці. Ціна - " + mounth1 * 50);
                    System.out.println("2." + mounth2 + " місяці. Ціна - " + mounth2 * 50);
                    System.out.println("3." + mounth3 + " місяці. Ціна - " + mounth3 * 50);
                    resp = Integer.parseInt(scanner.nextLine());
                    if (resp == 1) {
                        animals[animals[0].getPopulation()] = new Hare(mounth1, mounth1 * 50, "Заєць");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth1 * 50;
                        animals[0].population++;
                        System.out.println("ви купили зайця якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 2) {
                        animals[animals[0].getPopulation()] = new Hare(mounth2, mounth2 * 50, "Заєць");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth2 * 50;
                        animals[0].population++;
                        System.out.println("ви купили зайця якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                        scanner.nextLine();
                    } else if (resp == 3) {
                        animals[animals[0].getPopulation()] = new Hare(mounth3, mounth3 * 50, "Заєць");
                        animals[animals[0].getPopulation()].setAsLive(true);
                        money = money - mounth3 * 50;
                        animals[0].population++;
                        System.out.println("ви купили зайця якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                        scanner.nextLine();
                    }
                } else if (resp == 7) {
                    {
                        int mounth1 = (int) (Math.random() * (13));
                        int mounth2 = (int) (Math.random() * (13));
                        int mounth3 = (int) (Math.random() * (13));
                        System.out.println("1." + mounth1 + " місяці. Ціна - " + mounth1 * 50);
                        System.out.println("2." + mounth2 + " місяці. Ціна - " + mounth2 * 50);
                        System.out.println("3." + mounth3 + " місяці. Ціна - " + mounth3 * 50);
                        resp = Integer.parseInt(scanner.nextLine());
                        if (resp == 1) {
                            animals[animals[0].getPopulation()] = new Chicken(mounth1, mounth1 * 50, "Курка");
                            animals[animals[0].getPopulation()].setAsLive(true);
                            money = money - mounth1 * 50;
                            animals[0].population++;
                            System.out.println("ви купили курку якій " + mounth1 + " місяці " + "ціна - " + (mounth1 * 50) + "грн");
                            scanner.nextLine();
                        } else if (resp == 2) {
                            animals[animals[0].getPopulation()] = new Chicken(mounth2, mounth2 * 50, "Курка");
                            animals[animals[0].getPopulation()].setAsLive(true);
                            money = money - mounth2 * 50;
                            animals[0].population++;
                            System.out.println("ви купили курку якій " + mounth2 + " місяці " + "ціна - " + (mounth2 * 50) + "грн");
                            scanner.nextLine();
                        } else if (resp == 3) {
                            animals[animals[0].getPopulation()] = new Chicken(mounth3, mounth3 * 50, "Курка");
                            animals[animals[0].getPopulation()].setAsLive(true);
                            money = money - mounth3 * 50;
                            animals[0].population++;
                            System.out.println("ви купили курку якій " + mounth3 + " місяці " + "ціна - " + (mounth3 * 50) + "грн");
                            scanner.nextLine();
                        }
                    }
                }
            } else if (resp == 8) {
                day++;
                System.out.println("Зараз " + day + " день і місяць " + mounth);
                thisday = true;
                daysee = false;
                System.out.println("Гроші: " + money + " грн");
                System.out.println("У вас є такі тварини ");
                asHungryString = "Тварини голодні";
                for (int i = 0; i < animals[0].getPopulation(); i++) {
                    if (animals[i].asLive == true) {
                        System.out.println(animals[i].name + " - " + " - " + animals[i].getAge());
                        animals[i].setHungry(true);
                    }
                }
                if (day % 5 == 0) {
                    for (int j = 0; j < animals[0].population; j++) {
                        animals[j].setAge(animals[j].getAge() + 1);
                    }
                    mounth++;
                    day = 0;
                }
            } else if (resp == 9) {
                break;
            }
        }
    }
}
