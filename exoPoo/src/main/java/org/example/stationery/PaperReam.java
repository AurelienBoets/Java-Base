package org.example.stationery;

public class PaperReam extends UnitaryArticle {
    private double weight;

    public PaperReam(double price, String name, double weight) {
        super(price, name);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + " grammage: " + this.weight;
    }

}
