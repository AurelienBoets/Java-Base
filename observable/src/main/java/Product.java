import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private long stockLevel;
    private List<Observer> observers;

    public Product(long stockLevel) {
        this.stockLevel = stockLevel;
        this.observers=new ArrayList<>();
    }

    public long getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(long stockLevel) {
        this.stockLevel = stockLevel;
        notifyObservers(this);
    }

    @Override
    public void registerObserver(Observer observer) {
             this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
             this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(Product product) {
          this.observers.forEach(observer -> observer.update(this));
    }
}
