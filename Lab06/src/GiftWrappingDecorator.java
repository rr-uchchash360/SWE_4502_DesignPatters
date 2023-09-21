public class GiftWrappingDecorator extends ProductDecorator {
    public GiftWrappingDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        // Additional $5 for gift wrapping
        return decoratedProduct.getPrice() + 5.0;
    }
}