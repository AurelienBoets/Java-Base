package abstractFactory.abstractClass;

public abstract class CookingFactory {
    public abstract Ingredient createIngredient(String name);
    public abstract Dish createDish(String name);
    public abstract CookingUtensil createUtensil(String name);
}
