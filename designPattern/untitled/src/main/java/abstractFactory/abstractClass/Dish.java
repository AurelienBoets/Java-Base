package abstractFactory.abstractClass;

public abstract class Dish {
    protected String name;
    public void serve(){
        System.out.println("Le plat "+this.name+" est servi");
    }

    public Dish(String name) {
        this.name = name;
    }
}
