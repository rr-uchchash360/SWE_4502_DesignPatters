class PremiumDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9; // 10% discount for premium customers
    }
}