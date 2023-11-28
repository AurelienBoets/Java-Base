package org.example.tpBibliotheque;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loan {
    private Person person;
    private long idBook;
    private LocalDate startDate;
    private LocalDate endDate;

    public Loan(Person person, long idBook, LocalDate startDate, LocalDate endDate) {
        this.person = person;
        this.idBook = idBook;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getIdBook() {
        return idBook;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("""
                Personne: \t%s
                identifiant du livre:%d
                Date d'emprunt:%s
                Date de fin: %s
                """,person,idBook,dateFormat.format(startDate),dateFormat.format(endDate));
    }
}
