package zoo;

public class Monkey extends Animal{
    public Monkey(String type, String sound) {
        super(type, sound);
    }

    @Override
    public void registerObserver(ObserverAnimal observer) {
        this.observerAnimals.add(observer);
    }

    @Override
    public void removeObserver(ObserverAnimal observer) {
        this.observerAnimals.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observerAnimals.forEach(observerAnimal -> observerAnimal.update(this));
    }
}
