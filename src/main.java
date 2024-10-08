import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        OrderManager orderManager = new OrderManager(products);
        Product product1 = new Electronics("Iron", 10, 800);
        Product product2 = new Clothing("Gown", 50, 500.50);
        Product product3 = new Furniture("Table", 20, 350);
        products.add(product1);
        products.add(product2);
        products.add(product3);

    }

}
