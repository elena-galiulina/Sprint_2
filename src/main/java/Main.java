import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen = new Apple(8, 60, "green");
        Food[] cartProducts = {meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(cartProducts);
        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWhithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWhithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки: " + cart.getTotalPriceVegetarianWhithoutDiscount());
    }
}