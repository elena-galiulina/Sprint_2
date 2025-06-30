package model;

import static model.constants.Discount.DISCOUNT_ZERO;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public boolean isVegetarian() {
        return isVegetarian;
    }


    public Food(int amount, double price ){
        this.amount = amount;
        this.price = price;
    }
    public double getTotalPrice(){
        return this.price * this.amount;
    }
    @Override
    public double getDiscount(){
        return DISCOUNT_ZERO;
    }
}
