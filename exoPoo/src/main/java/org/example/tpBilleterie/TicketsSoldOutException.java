package org.example.tpBilleterie;

public class TicketsSoldOutException extends Exception {
    public TicketsSoldOutException() {
        super("Les billets sont épuisés");
    }
}
