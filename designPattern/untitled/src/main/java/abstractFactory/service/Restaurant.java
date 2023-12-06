package abstractFactory.service;

import abstractFactory.abstractClass.CookingFactory;

public class Restaurant {
    private CookingFactory cookingFactory;

    public Restaurant(CookingFactory cookingFactory) {
        setCookingFactory(cookingFactory);
    }

    public CookingFactory getCookingFactory() {
        return cookingFactory;
    }

    public void setCookingFactory(CookingFactory cookingFactory) {
        this.cookingFactory = cookingFactory;
    }
}
