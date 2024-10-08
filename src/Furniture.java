public class Furniture extends Product{
    @Override
    public double totalPrice(double unitPrice) {
        return unitPrice*1.08;
    }
}
