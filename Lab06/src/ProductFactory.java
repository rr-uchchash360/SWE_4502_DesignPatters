public class ProductFactory {
    public static Product createProduct(String type, double price, String category) {
        Product product = null;

        switch (type) {
            case "Book":
                product = new Book(price, category);
                break;
            case "Electronics":
                product = new Electronics(price, category);
                break;
            case "Clothing":
                product = new Clothing(price, category);
                break;
        }

        return product;
    }
}
