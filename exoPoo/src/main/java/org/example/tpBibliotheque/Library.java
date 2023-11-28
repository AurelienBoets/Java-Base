package org.example.tpBibliotheque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {
    private ArrayList<Loan> loans;
    private ArrayList<Book> books;

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void deleteBook(int idBook) {
        for (Book book : this.books) {
            if (book.getId() == idBook) {
                this.books.remove(book);
                return;
            }
        }
    }

    public List<Book> searchByTitle(String title) {
        List<Book> filterArray = new ArrayList<Book>();
        for (Book book : this.books) {
            if (Objects.equals(book.getTitle(), title)) {
                filterArray.add(book);
            }
        }
        return filterArray;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> filterArray = new ArrayList<Book>();
        for (Book book : this.books) {
            if (Objects.equals(book.getAuthor(), author)) {
                filterArray.add(book);
            }
        }
        return filterArray;
    }

    public void borrowBook(long idBook, Person person) {
        for (Loan loan : this.loans) {
            if (loan.getIdBook() == idBook) {
                System.out.println("Le livre est déjà emprunté");
                return;
            }
        }
        for (Book i : this.books) {
            if (i.getId() == idBook) {
                LocalDate startDate = LocalDate.now();
                LocalDate endDate = startDate.plusDays(14);
                Loan loan = new Loan(person, idBook, startDate, endDate);
                this.loans.add(loan);
                return;
            }
        }
    }

    public void returnBook(long idBook){
        for (Loan loan:this.loans) {
            if(loan.getIdBook()==idBook){
                this.loans.remove(loan);
                return;
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Library() {
        this.loans = new ArrayList<>();
        this.books = new ArrayList<>();
    }
}
