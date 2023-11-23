package org.example.tpManagementBook;

public class Author {
    private static int count=0;
    private int id;
    private String firstName;
    private String lastName;
    static {
        count++;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=count;
    }

    @Override
    public String toString() {
        return "Author{" +
                ", Prénom:'" + firstName + '\'' +
                ", Nom:'" + lastName + '\'' +
                '}';
    }
}
