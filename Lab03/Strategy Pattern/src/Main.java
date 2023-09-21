public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setDiscountStrategy(new RegularDiscountStrategy());
        cart.checkout(100.0);

        cart.setDiscountStrategy(new PremiumDiscountStrategy());
        cart.checkout(100.0);

        cart.setDiscountStrategy(new GoldDiscountStrategy());
        cart.checkout(100.0);
    }
}