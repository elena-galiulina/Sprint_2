package model;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Colour.COLOUR_GREEN;
import static model.constants.Discount.DISCOUNT_SIXTY;
import static model.constants.Discount.DISCOUNT_ZERO;

public class Apple extends Food implements Discountable{
    String colour;
    public Apple(int amount, double price, String colour ){
        super( amount, price);
        this.isVegetarian = true;
        this.colour = colour;
    }
    @Override
    public double getDiscount(){
        if (COLOUR_RED.equals(this.colour) ){
            return DISCOUNT_SIXTY;
        }
        return DISCOUNT_ZERO;

    }
}
