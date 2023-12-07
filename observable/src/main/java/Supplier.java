public class Supplier implements Observer{
    @Override
    public void update(Product product) {
        System.out.println("Supplier: Changement du stock à "+product.getStockLevel());
    }
}
