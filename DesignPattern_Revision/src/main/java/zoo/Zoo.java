package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final Object lock = new Object();
    private static volatile Zoo instance = null;
    private static List<Animal> animals;
    private static List<ObserverAnimal> observerAnimals;

    private Zoo() {
        animals=new ArrayList<>();
        observerAnimals=new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        observerAnimals.forEach(animal::registerObserver);
        animal.notifyObserver();
    }

    public void addObservers(ObserverAnimal observerAnimal){
        observerAnimals.add(observerAnimal);
        animals.forEach(animal -> animal.removeObserver(observerAnimal));
    }

    public Animal getAnimalById(long id){
        for (Animal animal:animals) {
            if(animal.getId()==id)
                return animal;

        }
        return null;
    }
    public void removeObserver(ObserverAnimal observerAnimal){
        observerAnimals.remove(observerAnimal);
        animals.forEach(animal -> animal.removeObserver(observerAnimal));
    }
    public List<Animal> getAnimals(){
        return animals;
    }
    public static Zoo getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new Zoo();
            }
        }
        return instance;
    }
}
