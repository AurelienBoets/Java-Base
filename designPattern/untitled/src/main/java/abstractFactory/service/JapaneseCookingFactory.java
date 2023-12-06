package abstractFactory.service;

import abstractFactory.abstractClass.CookingFactory;
import abstractFactory.abstractClass.CookingUtensil;
import abstractFactory.abstractClass.Dish;
import abstractFactory.abstractClass.Ingredient;
import abstractFactory.entity.JapaneseDish;
import abstractFactory.entity.JapaneseIngredient;
import abstractFactory.entity.JapaneseUtensil;

public class JapaneseCookingFactory extends CookingFactory {
    @Override
    public Ingredient createIngredient(String name) {
        return new JapaneseIngredient(name);
    }

    @Override
    public Dish createDish(String name) {
        return new JapaneseDish(name);
    }

    @Override
    public CookingUtensil createUtensil(String name) {
        return new JapaneseUtensil(name);
    }
}
