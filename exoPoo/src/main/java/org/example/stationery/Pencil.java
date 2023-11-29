package org.example.stationery;

public class Pencil extends UnitaryArticle{

    private String color;
    public Pencil(double price, String name,String color) {
        super(price, name);
        this.color=color;
    }

    @Override
    public String toString() {
        return super.toString()+"  couleur: "+this.color;
    }
}
