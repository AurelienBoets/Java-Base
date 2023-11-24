package org.example.tpHotel;

import java.util.Arrays;

public class Hotel {
    private String name;
    private Room[] rooms;
    private Reservation[] reservations;
    private Client[] clients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public void addClient(Client client){
        clients= Arrays.copyOf(clients,clients.length+1);
        clients[clients.length-1]=client;
    }

    public Hotel(String name, Room[] rooms, Reservation[] reservations, Client[] clients) {
        this.name = name;
        this.rooms = rooms;
        this.reservations = reservations;
        this.clients = clients;
    }

    public void displayClients(){
        for (Client i:
             clients) {
            System.out.println(i.toString());
        }
    }

    public Reservation[] filterByClient(Client client){
        Reservation[] reservations=new Reservation[0];
        for (Reservation i:
             reservations) {
            if(i.getClient().equals(client)){
                reservations=Arrays.copyOf(reservations,reservations.length+1);
                reservations[reservations.length-1]=i;
            }
        }
        return reservations;
    }
}
