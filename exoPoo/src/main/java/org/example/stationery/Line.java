package org.example.stationery;

public class Line {
    private int quantity;
    private long articleReference;
    private String articleName;
    private double unitaryPrice;
    private double price;
    private boolean isBatch;

    public Line(int quantity, UnitaryArticle article) {
        this.quantity = quantity;
        this.articleReference = article.getReference();
        this.articleName = article.getName();
        this.unitaryPrice = article.getPrice();
        this.price = article.getPrice()*quantity;
        this.isBatch=false;
    }

    public Line(int quantity, Batch batch) {
        this.quantity = quantity;
        this.articleReference = batch.getReference();
        this.articleName = batch.getArticle().getName();
        this.unitaryPrice = batch.getPrice();
        this.price = batch.getPrice()*quantity;
        this.isBatch=true;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
       if(isBatch){
           return String.format("Lot de %s x%d prix: %.2f total: %.2f",articleName,quantity,unitaryPrice,price);
       }else return String.format("Article %s x%d prix: %.2f total: %.2f",articleName,quantity,unitaryPrice,price);
    }
}
