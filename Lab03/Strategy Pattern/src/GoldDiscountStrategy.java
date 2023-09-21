public class GoldDiscountStrategy implements DiscountStrategy  {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.8; // 20% discount for gold customers
    }
}
