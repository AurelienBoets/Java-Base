public class StockManager implements Observer{
    @Override
    public void update(Product product) {
        System.out.println("Manager: changement du stock à :"+product.getStockLevel());
    }
}
