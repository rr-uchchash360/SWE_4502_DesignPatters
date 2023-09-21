public class ProductFactory {
    public static Product createProduct(String type, double price, String category) {
        Product product = null;

        // Add new product types here as needed
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
            // Add more cases for new product types

            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
        }

        return product;
    }
}
