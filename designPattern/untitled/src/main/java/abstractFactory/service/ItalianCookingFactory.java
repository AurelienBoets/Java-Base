package abstractFactory.service;

import abstractFactory.abstractClass.CookingFactory;
import abstractFactory.abstractClass.CookingUtensil;
import abstractFactory.abstractClass.Dish;
import abstractFactory.abstractClass.Ingredient;
import abstractFactory.entity.ItalianDish;
import abstractFactory.entity.ItalianUtensil;
import abstractFactory.entity.ItalienIngredient;

public class ItalianCookingFactory extends CookingFactory {
    @Override
    public Ingredient createIngredient(String name) {
        return new ItalienIngredient(name);
    }

    @Override
    public Dish createDish(String name) {
        return new ItalianDish(name);
    }

    @Override
    public CookingUtensil createUtensil(String name) {
        return new ItalianUtensil(name);
    }


}
