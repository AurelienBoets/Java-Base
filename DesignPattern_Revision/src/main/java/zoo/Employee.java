package zoo;

public class Employee implements ObserverAnimal{
    @Override
    public void update(Animal animal) {
        System.out.println("Un "+animal.getType() +" vient d'arriver dans le zoo");
    }
}
