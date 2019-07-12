package com.stackroute.hackathon;

import java.util.Scanner;

import static java.lang.System.exit;

public class BillsBurger {
    public static void main(String[] args) {

        System.out.println("Welcome to BillsBurger.....!!!");
        System.out.println("1:Base Burger       2:Healthy Burger        3:DeluxeBurger");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                BaseHamburger baseHamburger = new BaseHamburger("bun", "chicken", 150);
                baseHamburger.getBaseHamburgerPrice();
                break;
            case 2:
                HealthyBurger healthyBurger = new HealthyBurger(" brown rye bread roll", "chicken", 150);
                System.out.println("1:Lettuce       2:Carrot        3:Tomato        4:Capsicum      5:Avacado       6:Cabbage");
                System.out.println("Enter 0 if no add ons required... ");
                System.out.println("Enter number of additions");
                int numberOfAddOns = scanner.nextInt();
                for (int i = 0; i < numberOfAddOns; i++) {
                    int input2 = scanner.nextInt();
                    switch (input2) {
                        case 1:
                            healthyBurger.addLettuceAddOn();
                            break;
                        case 2:
                            healthyBurger.addCarrotAddOn();
                            break;
                        case 3:
                            healthyBurger.addTomatoAddOns();
                            break;
                        case 4:
                            healthyBurger.addCapsicumAddOns();
                            break;
                        case 5:
                            healthyBurger.addAvacadoAddOns();
                            break;
                        case 6:
                            healthyBurger.addCabbageAddOns();
                            break;
                        default:
                            exit(0);
                    }
                }
                System.out.println("Price Of Healthy Burger with AddOns: " + healthyBurger.priceHealthBurger());
                break;
            case 3:
                DeluxeBurger deluxeBurger = new DeluxeBurger("bun", "chicken", 150, 50, 60);
                System.out.println("Price of Deluxe Burger with coke and chips:" + deluxeBurger.priceOfDeluxeBurger());
            default:
                exit(0);
        }
    }
}