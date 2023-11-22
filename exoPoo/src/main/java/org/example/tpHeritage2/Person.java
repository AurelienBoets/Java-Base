package org.example.tpHeritage2;

public class Person {
    private House house;
    private String name;

    public void display(){
        System.out.println("Je m'appele "+this.name);
        house.display();
        house.getDoor();
    }

    public Person(String name,House house){
        this.name=name;
        this.house=house;
    }
}
