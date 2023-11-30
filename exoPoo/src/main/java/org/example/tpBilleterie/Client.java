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
    private String firstName,lastName,mail;
    private List<Event> events;

    public Client(String firstName,String lastName){
        setFirstName(firstName);
        setLastName(lastName);
        this.events=new ArrayList<>();
    }
}
