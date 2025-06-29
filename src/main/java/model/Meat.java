package model;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.DISCOUNT_SIXTY;
import static model.constants.Discount.DISCOUNT_ZERO;

public class Meat extends Food implements Discountable {
    public Meat(int amount, double price ){
        super( amount, price);
        this.isVegetarian = false;
    }

}
