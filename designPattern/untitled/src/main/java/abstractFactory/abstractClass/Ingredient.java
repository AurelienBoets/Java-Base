package abstractFactory.abstractClass;

public abstract class Ingredient {
    protected String name;
    public  void prepare(){
        System.out.println("Préparation de l'ingrédient "+this.name);
    }

    public Ingredient(String name) {
        this.name = name;
    }
}
