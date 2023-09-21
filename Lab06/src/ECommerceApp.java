public class ECommerceApp {
    public static void main(String[] args) {
        // Creating a book without gift wrapping and applying discount
        Product book = ProductFactory.createProduct("Book", 30.0, "Fiction");
        book = new GiftWrappingDecorator(book); // Add gift wrapping (optional)
        System.out.println("Price of Book with Gift Wrapping: $" + book.getPrice());

        // Creating electronics without gift wrapping and applying discount
        Product electronics = ProductFactory.createProduct("Electronics", 500.0, "Gadgets");
        System.out.println("Price of Electronics: $" + electronics.getPrice());

        // Creating clothing with gift wrapping and applying discount
        Product clothing = ProductFactory.createProduct("Clothing", 50.0, "Shirts");
        clothing = new GiftWrappingDecorator(clothing); // Add gift wrapping (optional)
        System.out.println("Price of Clothing with Gift Wrapping: $" + clothing.getPrice());
    }
}
