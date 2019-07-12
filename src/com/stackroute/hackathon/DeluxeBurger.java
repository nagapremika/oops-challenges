package com.stackroute.hackathon;

public class DeluxeBurger extends BaseHamburger{
    private int chipsPrice;
    private int cokePrice;

    public DeluxeBurger(String rollType, String meat, int price,int chipsPrice, int cokePrice) {
        super(rollType,meat,price);
        this.chipsPrice=chipsPrice;
        this.cokePrice=cokePrice;
    }
    public int priceOfDeluxeBurger()
    {
        int price=getBaseHamburgerPrice()+chipsPrice+cokePrice;
        return price;
    }
}
