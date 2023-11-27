package org.example.tpHotel;

public class Room {
    private int num;
    private StateRoom stateRoom;
    private double price;
    private int capacity;

    public int getNum() {
        return num;
    }

    public StateRoom getStateRoom() {
        return stateRoom;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setStateRoom(StateRoom stateRoom) {
        this.stateRoom = stateRoom;
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
                ", Statut=" + stateRoom +
                ", Prix= %.2f"  +
                ", Capacité=" + capacity +
                '}',price);
    }
}
