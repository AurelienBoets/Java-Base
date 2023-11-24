package org.example.tpHotel;

public class Room {
    private int num;
    private StateReservation stateReservation;
    private double price;
    private int capacity;

    public int getNum() {
        return num;
    }

    public StateReservation getStateReservation() {
        return stateReservation;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setStateReservation(StateReservation stateReservation) {
        this.stateReservation = stateReservation;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Room(int num,  double price, int capacity) {
        this.num = num;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("Chambre{" +
                "Numéro=" + num +
                ", Statut=" + stateReservation +
                ", Prix= %.2f"  +
                ", Capacité=" + capacity +
                '}',price);
    }
}
