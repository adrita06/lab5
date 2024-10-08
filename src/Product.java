public abstract class Product {
    String name;
    int stockQuantity;
    double unitPrice;
    public Product(String name,int stockQuantity,double unitPrice) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
    }

    public static double totalPrice(double unitPrice) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
