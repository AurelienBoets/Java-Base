package org.example.stationery;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private static long count=1;
    private long num;
    private List<Line> lines;
    private String client;
    private LocalDateTime date;


    public Invoice( String client) {
        this.num=count++;
        this.lines = new ArrayList<>();
        this.client = client;
        this.date = LocalDateTime.now();
    }

    public void addLine(long refArticle,int quantityArticle){
        Article article=Stationery.getArticles().get(refArticle);
        if(article!=null){
            Line line;
            if(article instanceof UnitaryArticle) {
                 line = new Line(quantityArticle, (UnitaryArticle) article);
            }else{
                 line=new Line(quantityArticle,(Batch) article);
            }
            this.lines.add(line);
        }
    }

    public double getTotal(){
        double total=0;
        for (Line line:this.lines) {
            total+=line.getPrice();
        }
        return total;
    }

    public List<Line> getLines() {
        return lines;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getClient() {
        return client;
    }

    public long getNum() {
        return num;
    }
}
