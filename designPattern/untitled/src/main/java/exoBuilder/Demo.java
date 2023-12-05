package exoBuilder;

import exoBuilder.Enum.*;


public class Demo {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .size(PizzaSize.MEDIUM)
                .typeOfDough(Dough.FINE)
                .cheese(Cheese.MOZZARELLA)
                .addTopping("Jambon")
                .addTopping("Champignon")
                .sauce(Sauce.TOMATO)
                .build();
        System.out.println(pizza);
    }
}
