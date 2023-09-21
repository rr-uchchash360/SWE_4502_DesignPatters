public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount; // No discount for regular customers
    }
}
