package zoo;

public interface Subject {
    void registerObserver(ObserverAnimal observer);
    void removeObserver(ObserverAnimal observer);
    void notifyObserver();
}
