package org.example.tpBibliotheque;

public class Book {

    private static int count=1;
    protected String title;
    protected String author;
    protected int id;

    public Book(String title, String author) {
        this.id=count++;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("""
                Titre: %s
                Auteur: %s
                Identifiant: %d
                """,title,author,id);
    }
}
