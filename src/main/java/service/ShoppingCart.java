package service;

import model.Food;

public class ShoppingCart {
    private Food[] cart;
    public ShoppingCart(Food[] cart) {
        this.cart = cart;
    }
    public double getTotalPriceWhithoutDiscount(){
        double totalPriceWhithoutDiscount = 0;
        for (int i=0; i < cart.length; i++){
            totalPriceWhithoutDiscount += cart[i].getTotalPrice();
        }
        return totalPriceWhithoutDiscount;
    }
    public double getTotalPriceWhithDiscount(){
        double totalPriceWhithDiscount = 0;
        for (int i=0; i < cart.length; i++){
            totalPriceWhithDiscount += (cart[i].getTotalPrice() - ((cart[i].getTotalPrice()*cart[i].getDiscount())/100));
        }
        return totalPriceWhithDiscount;
    }
    public double getTotalPriceVegetarianWhithoutDiscount(){
        double totalPriceVegetarianWhithoutDiscount = 0;
        for (int i=0; i < cart.length; i++){
            if( cart[i].isVegetarian()) {
                totalPriceVegetarianWhithoutDiscount += cart[i].getTotalPrice();
            }
        }
        return totalPriceVegetarianWhithoutDiscount;
    }
}
