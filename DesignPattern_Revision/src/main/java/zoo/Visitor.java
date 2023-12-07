package zoo;

public class Visitor implements ObserverAnimal {

    @Override
    public void update(Animal animal) {
        System.out.println("Un "+animal.getType()+" vient d'arriver au zoo. Il "+animal.getSound());
    }

    public void sound(Animal animal){
        System.out.println(animal.getType() + " "+animal.getSound());
    }
}
