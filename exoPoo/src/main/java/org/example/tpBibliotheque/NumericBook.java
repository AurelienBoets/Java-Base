package org.example.tpBibliotheque;

public class NumericBook extends Book{
    private String format;
    private long size;

    public NumericBook(String title, String author, String format, long size) {
        super(title, author);
        this.format = format;
        this.size = size;
    }
}
