package org.example.tpHeritage1;

public class Student extends Person{
    public void goToClass(){
        System.out.println("I'm going to class");
    }

    public void displayYear(){
        System.out.printf("I am %d years old\n",this.year);
    }

    public Student(int year){
        super(year);
    }
}
