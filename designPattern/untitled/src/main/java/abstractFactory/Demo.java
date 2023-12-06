package abstractFactory;

import abstractFactory.service.*;

public class Demo {
    public static void main(String[] args) {
        Restaurant japaneseRestaurant=new Restaurant(new JapaneseCookingFactory());
        Restaurant italianRestaurant=new Restaurant(new ItalianCookingFactory());
        Restaurant mexicanRestaurant=new Restaurant(new MexicanCookingFactory());


    }
}
