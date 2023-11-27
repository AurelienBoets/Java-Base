package org.example.tpHotel;

public class Client {
    private static int count=1;
    private int id;
    private String firstName;
    private String lastName;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public Client(String firstName, String lastName, String phone) {
        this.id=count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id +"{"+
                "Prénom='" + firstName + '\'' +
                ", Nom='" + lastName + '\'' +
                ", Téléphone='" + phone + '\'' +
                '}';
    }
}
