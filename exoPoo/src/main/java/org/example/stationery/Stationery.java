package org.example.stationery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Stationery {
    private static HashMap<Long,Article> articles=new HashMap<>();
    private List<Invoice> invoices=new ArrayList<>();

    static HashMap<Long,Article> getArticles(){
        return articles;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void addBatch(UnitaryArticle article, int quantity, float discount){
        Batch batch=new Batch(article,quantity,discount);
        articles.put(batch.getReference(), batch);
    }

     public void addArticle(double price,String name,String color){
        Pencil pencil=new Pencil(price,name,color);
        articles.put(pencil.getReference(), pencil);
     }

     public void addArticle(double price,String name,double weight){
        PaperReam paperReam=new PaperReam(price, name, weight);
        articles.put(paperReam.getReference(), paperReam);
     }

     public boolean hasArticle(){
         for (Long k:articles.keySet()) {
             if(articles.get(k) instanceof UnitaryArticle){
                 return true;
             }
         }
         return false;
     }

     public List<UnitaryArticle> getOnlyArticle(){
        List<UnitaryArticle> list=new ArrayList<>();
         for (long key:articles.keySet()) {
             if(articles.get(key) instanceof UnitaryArticle){
                 list.add((UnitaryArticle) articles.get(key));
             }
         }
         return list;
     }

     public boolean removeArticle(Long refArticle){
        boolean isCorrect=false;
         for (long key: articles.keySet()) {
             if(articles.get(key).getReference()==refArticle){
                 articles.remove(key);
                 isCorrect=true;
                 if(articles.get(key) instanceof Batch){
                     return isCorrect;
                 }
             }
             if(articles.get(key) instanceof Batch && refArticle==((Batch) articles.get(key)).getArticle().getReference()){
                 articles.remove(key);
                 isCorrect=true;
             }

         }
         return isCorrect;
     }

     public void addInvoice(Invoice invoice){
        this.invoices.add(invoice);
     }
}
