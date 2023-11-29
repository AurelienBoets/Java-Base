package org.example.stationery;

public abstract class UnitaryArticle extends Article{
    protected double price;
    protected String name;

    protected UnitaryArticle(double price,String name){
        this.price=price;
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("reference: %d nom: %.15s prix: %.2f",this.reference,this.name,this.price);
    }
}
