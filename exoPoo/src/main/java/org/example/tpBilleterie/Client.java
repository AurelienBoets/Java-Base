package org.example.tpBilleterie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString

public class Client {
    @Setter
    private String firstName, lastName, mail;
    private List<Event> events;

    public Client(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        this.events = new ArrayList<>();
    }

    public void buyTicket(Event event) {
        try{
            event.saleTicket();
             this.events.add(event);
            System.out.println("Ticket acheté");
        }catch (TicketsSoldOutException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean cancelBuyTicket(Event event) {
        if (this.events.contains(event)) {
            event.cancelSale();
            return this.events.remove(event);
        } else {
            return false;
        }
    }

}
