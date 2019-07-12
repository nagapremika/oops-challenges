package com.stackroute.hackathon;

public class BaseHamburger implements Additions{
    private  String rollType;
    private String meat;
    private int price;

    public BaseHamburger(String rollType, String meat, int price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public int getBaseHamburgerPrice()
    {
        System.out.println("BaseHamburger price:"+this.price);
        return price;
    }

    public int getLettucePrice(){

        return lettucePrice;
    }

    public int getTomatoPrice() {

        return tomatoPrice;
    }

    public int getCarrotPrice() {

        return carrotPrice;
    }

    public int getCapsicumPrice() {

        return capsicumPrice;
    }

}
