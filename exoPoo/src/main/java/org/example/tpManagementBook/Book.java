package org.example.tpManagementBook;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
    private static int count=0;
    private int id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private int publishingYear;
    private int amountPage;
    private BigDecimal price;
    private CoverType coverType;
    static {
        count++;
    }

    public Book(String name, Author[] authors, Publisher publisher, int publishingYear, int amountPage, BigDecimal price, CoverType coverType) {
        this.id = count;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountPage = amountPage;
        this.price = price;
        this.coverType = coverType;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    @Override
    public String toString() {
        return String.format("""
                Nom : %s
                Auteurs: %s
                Editeur: %s
                Année d'édition : %d
                Nombre de Page: %d
                Prix: %.2f
                Couverture: %s
                """,name, Arrays.toString(authors),publisher,publishingYear,amountPage,price,coverType.name());
    }
}
