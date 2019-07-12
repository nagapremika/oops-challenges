package com.stackroute.hackathon;

public class HealthyBurger extends BaseHamburger implements Additions {
    public HealthyBurger(String rollType, String meat, int price) {

        super(rollType, meat, price);
    }

    private int avacado;
    private int cabbage;
    private int avacadoPrice = 78;
    private int mustardPrice = 90;
    private int lettuceAddOns;
    private int carrotAddOns;
    private int tomatoAddOns;
    private int capsicumAddOns;

    public void addLettuceAddOn() {
        this.lettuceAddOns++;
    }

    public void addCarrotAddOn() {
        this.carrotAddOns++;
    }

    public void addCapsicumAddOns() {
        this.capsicumAddOns++;
    }

    public void addTomatoAddOns() {
        this.tomatoAddOns++;
    }
    public void addAvacadoAddOns()
    {
        this.avacado++;
    }
    public void addCabbageAddOns()
    {
        this.cabbage++;
    }

    public int getLettucePrice() {
        return lettucePrice * lettuceAddOns;
    }

    public int getTomatoPrice() {
        return tomatoPrice * tomatoAddOns;
    }

    public int getCarrotPrice() {
        return carrotPrice * carrotAddOns;
    }

    public int getCapsicumPrice() {
        return capsicumPrice * capsicumAddOns;
    }

    public int priceHealthBurger() {
        int price = getBaseHamburgerPrice();
        if (lettuceAddOns != 0) {
            price = price + getLettucePrice();
            System.out.println("LettuceAddOnPrice:"+lettucePrice);
        }
        if (tomatoAddOns != 0) {
            price = price + getTomatoPrice();
            System.out.println("TomatoAddOnPrice:"+tomatoPrice);
        }
        if (capsicumAddOns != 0) {
            price = price + getCapsicumPrice();
            System.out.println("CapsiucumAddOnPrice:"+capsicumPrice);
        }
        if (carrotAddOns != 0) {
            price = price + getCarrotPrice();
            System.out.println("CarrotAddOnPrice:"+capsicumPrice);
        }
        if (avacado != 0) {
            price = avacadoPrice*avacado;
            System.out.println("AvacadoAddOnPrice:"+avacadoPrice);
        }
        if (cabbage != 0) {
            price = mustardPrice*cabbage;
            System.out.println("MustardAddOnPrice:"+mustardPrice);
        }
       return price;
    }
}

