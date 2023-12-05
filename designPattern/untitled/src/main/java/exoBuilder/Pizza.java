package exoBuilder;

import exoBuilder.Enum.*;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private PizzaSize size;
    private Dough typeOfDough;
    private Cheese cheese;
    private List<String> toppings;
    private Sauce sauce;

    private Pizza(Builder builder){
        this.sauce=builder.sauce;
        this.toppings=builder.toppings;
        this.cheese=builder.cheese;
        this.size=builder.size;
        this.typeOfDough=builder.typeOfDough;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", typeOfDough=" + typeOfDough +
                ", cheese=" + cheese +
                ", toppings=" + toppings +
                ", sauce=" + sauce +
                '}';
    }

    public static class Builder{
        private PizzaSize size;
        private Dough typeOfDough;
        private Cheese cheese;
        private List<String> toppings=new ArrayList<>();
        private Sauce sauce;

        public Builder size(PizzaSize size) {
            this.size = size;
            return this;
        }

        public Builder typeOfDough(Dough typeOfDough) {
            this.typeOfDough = typeOfDough;
            return this;
        }

        public Builder cheese(Cheese cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Builder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
