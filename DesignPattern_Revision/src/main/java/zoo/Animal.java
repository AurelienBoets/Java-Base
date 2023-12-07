package zoo;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Subject{
    private static long count=0;
    protected long id;


    protected String type;
    protected String sound;
    protected List<ObserverAnimal> observerAnimals;

    public String getType(){
        return this.type;
    }

    public String getSound(){
        return this.sound;
    }

    public long getId() {
        return id;
    }

    public void makeSound(){
        this.observerAnimals.forEach(observerAnimal ->  {
            if(observerAnimal instanceof Visitor)
                ((Visitor) observerAnimal).sound(this);
        });
    }

    public Animal(String type, String sound) {
        this.observerAnimals=new ArrayList<>();
        this.type = type;
        this.sound = sound;
        this.id=++count;
    }
}
