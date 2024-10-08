import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class OrderManager {
   ArrayList<Product>products=new ArrayList<>();

    public OrderManager(ArrayList<Product> products) {
        this.products = products;
    }
    public void order(ArrayList<Product> products) {
        products.sort((a, b) -> Double.compare(a.totalPrice(a.unitPrice), b.totalPrice(b.unitPrice)));
    }



}
