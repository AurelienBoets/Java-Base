public class Main {
    public static void main(String[] args) {
        Product product=new Product(1500);
        StockManager manager=new StockManager();
        Supplier supplier=new Supplier();
        product.registerObserver(supplier);
        product.registerObserver(manager);
        product.setStockLevel(3000);
    }
}
