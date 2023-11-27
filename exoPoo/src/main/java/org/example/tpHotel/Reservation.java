package org.example.tpHotel;

public class Reservation {
    private int num;
    private static int count=1;
    private StateReservation stateReservation;
    private Client client;
    private Room room;

    public int getNum() {
        return num;
    }

    public StateReservation getStateReservation() {
        return stateReservation;
    }

    public Client getClient() {
        return client;
    }

    public Room getRoom() {
        return room;
    }

    public void setStateReservation(StateReservation stateReservation) {
        this.stateReservation = stateReservation;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Reservation( StateReservation stateReservation, Client client, Room room) {
        this.num = count++;
        this.stateReservation = stateReservation;
        this.client = client;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "numéro=" + num +
                ", Statut=" + stateReservation.name() +
                ", Client=" + client +
                ", Chambre=" + room +
                '}';
    }
}
