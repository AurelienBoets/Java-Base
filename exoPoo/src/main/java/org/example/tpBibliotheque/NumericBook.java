package org.example.tpBibliotheque;

public class NumericBook extends Book{
    private String format;
    private double size;

    public NumericBook(String title, String author, String format, double size) {
        super(title, author);
        this.format = format;
        this.size = size;
    }
}
