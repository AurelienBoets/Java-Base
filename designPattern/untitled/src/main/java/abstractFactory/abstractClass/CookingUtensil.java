package abstractFactory.abstractClass;

public abstract class CookingUtensil {
    protected String name;
    public void use(){
        System.out.println("Utilisation de "+ name);
    }
    public CookingUtensil(String name){
        this.name=name;
    }
}
