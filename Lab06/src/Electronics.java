public class Electronics implements Product {
    private double price;
    private String category;

    public Electronics(double price, String category) {
        this.price = price;
        this.category = category;
    }

    @Override
    public double getPrice() {
        return price;
    }
}