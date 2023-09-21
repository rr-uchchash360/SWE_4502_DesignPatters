public class Clothing implements Product {
    private double price;
    private String category;

    public Clothing(double price, String category) {
        this.price = price;
        this.category = category;
    }

    @Override
    public double getPrice() {
        return price;
    }
}