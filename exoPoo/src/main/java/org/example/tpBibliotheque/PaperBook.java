package org.example.tpBibliotheque;

public class PaperBook extends Book{
    private int amoutPage;
    private String edition;

    public PaperBook(String title, String author, int amoutPage, String edition) {
        super(title, author);
        this.amoutPage = amoutPage;
        this.edition = edition;
    }
}
