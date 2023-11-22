package org.example.tpHeritage1;

public class Teacher extends Person {
    private String subject;

    public Teacher(int year) {
        super(year);
    }

    public void explain(){
        System.out.println("Explanation begins");
    }
}
