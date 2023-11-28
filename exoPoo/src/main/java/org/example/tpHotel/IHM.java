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
        Hotel hotel=new Hotel(hotelName,rooms,new Reservation[] {},new Client[] {});
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
                case 3->displayReservation(hotel);
                case 4->createReservation(hotel);
                case 5->cancelReservation(hotel);
                case 6-> System.out.println(Arrays.toString(hotel.getReservations()));
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
        return new Client(firstName,lastName,phone);
    }

    public void displayReservation(Hotel hotel){
        hotel.displayClients();
        System.out.println("Tapez le numéro du client");
        int id=sc.nextInt();
        Client client=hotel.getClientById(id);
        if(client==null){
            System.out.println("Ce client n'existe pas dans la base de données");
        }else{
            System.out.println(Arrays.toString(hotel.filterByClient(client)));
        }
    }

    public void createReservation(Hotel hotel){
        hotel.displayClients();
        System.out.println("Tapez le numéro du client");
        int id=sc.nextInt();
        Client client=hotel.getClientById(id);
        if(client==null){
            System.out.println("Le client n'existe pas dans la base de données");
            return;
        }
        System.out.println("Indiquez le nombre de personnes");
        int nb=sc.nextInt();
        Room[] rooms=hotel.getRoomByCapacity(nb);
        boolean loop=true;
        Room room=null;
        if(rooms.length==0){
            System.out.println("Aucune chambre disponible");
            return;
        }
        do {
            System.out.println(Arrays.toString(rooms));
            System.out.println("Choississez le numéro de chambre");
            int numRoom= sc.nextInt();
            if(searchRoom(rooms,numRoom)){
                loop=false;
                room=hotel.getRoomByNum(numRoom);
            }
            else{
                System.out.println("Numéro invalide");
            }
        }while (loop);
        Reservation reservation=new Reservation(StateReservation.Validée,client,room);
        hotel.addReservation(reservation);
    }

    public boolean searchRoom(Room[] rooms, int numRoom){
        for (Room i:rooms) {
            if(i.getNum()==numRoom){
                return true;
            }
        }
        return false;
    }

    public void cancelReservation(Hotel hotel){
        hotel.displayClients();
        System.out.println("Tapez le numéro du client");
        int id=sc.nextInt();
        Client client=hotel.getClientById(id);
        if(client==null){
            System.out.println("Ce client n'existe pas dans la base de données");
            return;
        }
        Reservation[] reservations=hotel.filterByClient(client);
        System.out.println(Arrays.toString(reservations));
        System.out.println("Indiquez le numéro de la réservation que vous voulez annulée");
        int numReservation=sc.nextInt();
        Reservation reservation=selectReservation(reservations,numReservation);
        if(reservation.getClient()!=client){
            System.out.printf("La réservation n'appartient pas à %s %s",client.getFirstName(),client.getLastName());
            return;
        }
        reservation.setStateReservation(StateReservation.Annulée);
    }

    public Reservation selectReservation(Reservation[] reservations,int numReservation){
        for (Reservation i:reservations) {
            if(i.getNum()==numReservation){
                return i;
            }
        }
        return null;
    }
}
