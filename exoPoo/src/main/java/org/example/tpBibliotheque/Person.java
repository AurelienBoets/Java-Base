package org.example.tpBibliotheque;

public class Person {
    private String firstname;
    private String lastName;

    public Person(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("""
                Nom: %s
                Prénom: %s
                """,lastName,firstname);
    }
}
