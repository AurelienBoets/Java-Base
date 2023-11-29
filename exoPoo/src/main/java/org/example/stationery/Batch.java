package org.example.stationery;

public class Batch extends Article {
    private UnitaryArticle article;
    private int quantity;
    private float discount;

    public Batch(UnitaryArticle article, int quantity, float discount) {
        this.article = article;
        this.quantity = quantity;
        this.discount = discount;
    }

    public UnitaryArticle getArticle() {
        return article;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return this.article.getPrice() * (1 - (this.discount / 100));
    }

    @Override
    public String toString() {
        return "Lot "+ this.article + String.format("\nQuantité: %d     remise: %.2f", this.quantity, this.discount);
    }
}
