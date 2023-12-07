package zoo;

public class SnakeFactory extends AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Snake("Serpent","siffle");
    }
}
