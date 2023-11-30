package org.example.tpBilleterie;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@ToString
@Getter
@Setter
public class Event {
    private String name;
    private LocalDate date;
    private LocalTime time;
    private Place place;
    private float price;
    private int sellTicket;

    public Event(String name,LocalDate date,LocalTime time,Place place,float price){
        setName(name);
        setDate(date);
        setTime(time);
        setPlace(place);
        setPrice(price);
    }
}
