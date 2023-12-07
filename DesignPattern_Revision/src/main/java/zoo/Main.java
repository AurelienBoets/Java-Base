package zoo;

public class Main {
    public static void main(String[] args) {
        Visitor visitor=new Visitor();
        Animal monkey=new MonkeyFactory().createAnimal();
        Animal snake=new SnakeFactory().createAnimal();
        Employee employee=new Employee();
        Zoo.getInstance().addObservers(employee);
        System.out.print("Employee: ");
        Zoo.getInstance().addAnimal(snake);
        Zoo.getInstance().addObservers(visitor);
        System.out.println("Visitor:");
        Zoo.getInstance().getAnimalById(snake.getId()).makeSound();
        Zoo.getInstance().addAnimal(monkey);

    }
}
