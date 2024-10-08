public abstract class Product {
    String name;
    int stockQuantity;
    double unitPrice;
    public abstract double totalPrice(double unitPrice);

}
