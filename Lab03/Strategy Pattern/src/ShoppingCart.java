class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double checkout(double totalAmount) {
        if (discountStrategy != null) {
            double discountedAmount = discountStrategy.applyDiscount(totalAmount);
            System.out.println("Total amount: $" + totalAmount);
            System.out.println("Discounted amount: $" + discountedAmount);
            return discountedAmount;
        } else {
            throw new IllegalStateException("Discount strategy not set");
        }
    }
}