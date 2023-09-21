public class ElectronicsDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice * 0.9; // 10% discount for electronics
    }
}