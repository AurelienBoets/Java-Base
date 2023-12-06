package abstractFactory.service;

import abstractFactory.abstractClass.CookingFactory;
import abstractFactory.abstractClass.CookingUtensil;
import abstractFactory.abstractClass.Dish;
import abstractFactory.abstractClass.Ingredient;
import abstractFactory.entity.MexicanDish;
import abstractFactory.entity.MexicanIngredient;
import abstractFactory.entity.MexicanUtensil;

public class MexicanCookingFactory extends CookingFactory {
    @Override
    public Ingredient createIngredient(String name) {
        return new MexicanIngredient(name);
    }

    @Override
    public Dish createDish(String name) {
        return new MexicanDish(name);
    }

    @Override
    public CookingUtensil createUtensil(String name) {
        return new MexicanUtensil(name);
    }
}
