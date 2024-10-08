public abstract class Product {
    String name;
    int stockQuantity;
    double unitPrice;
    public Product(String name,int stockQuantity,double unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }
    public abstract double totalPrice(double unitPrice);


}
