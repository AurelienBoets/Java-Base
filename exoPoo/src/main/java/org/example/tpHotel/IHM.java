package org.example.tpHotel;

import java.util.Arrays;
import java.util.Scanner;

public class IHM {
    Scanner sc=new Scanner(System.in);
    public void start(){
        System.out.println("Donnez un nom à l'hôtel");
        Scanner sc=new Scanner(System.in);
        String hotelName= sc.next().trim();
        Room[] rooms=new Room[0];
        for (int i = 0; i < 20; i++) {
            Room room=new Room(i+1,50*(i+1),i+2);
            rooms = Arrays.copyOf(rooms, rooms.length + 1);
            rooms[rooms.length - 1] = room;
        }
        Hotel hotel=new Hotel(hotelName,rooms,null,null);
        int choice;
        do {
            System.out.println("""
                             Menu
                ---------------------------------
                0.Quittez
                1.Ajouter un client
                2.Afficher la liste des clients
                3.Afficher les réservations d'un client
                4.Ajouter une réservation
                5.Annuler une réservation
                6.Afficher la liste des réservations
                """);
            choice=sc.nextInt();
            switch (choice){
                case 1->hotel.addClient(createClient());
                case 2->hotel.displayClients();

            }
        }while(choice!=0);
    }

    public Client createClient(){
        System.out.println("Indiquez le nom du client:");
        String lastName=sc.next().trim();
        System.out.println("Indiquez le prénom du client:");
        String firstName=sc.next().trim();
        System.out.println("Indiquez le numéro de téléphone du client");
        String phone= sc.next().trim();
        Client client=new Client(firstName,lastName,phone);
        return client;
    }
}
