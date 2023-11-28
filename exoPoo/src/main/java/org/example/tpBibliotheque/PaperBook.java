package org.example.tpBibliotheque;

public class PaperBook extends Book{
    private int amountPage;
    private String edition;

    public PaperBook(String title, String author, int amountPage, String edition) {
        super(title, author);
        this.amountPage = amountPage;
        this.edition = edition;
    }
}
