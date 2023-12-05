package org.example.tpBilleterie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private static Scanner sc=new Scanner(System.in);
    private static List<Place> places=new ArrayList<>();


//    public static void start(){
//        try{
//            int choice;
//            do {
//                choice=menu();
//                switch(choice){
//
//                }
//            }while(choice!=0);
//        }catch (){
//
//        }
//    }
    private static int menu(){
        System.out.println("----- Menu -----");
        System.out.println("1. Ajouter/Modifier/Supprimer Lieu");
        System.out.println("2. Ajouter/Modifier/Supprimer Evenement");
        System.out.println("3. Ajouter/Modifier/Supprimer Client");
        System.out.println("4. Acheter Billet");
        System.out.println("5. Annuler Achat Billet");
        System.out.println("6. Afficher Liste Evenements Disponibles");
        System.out.println("7. Afficher Liste Billets Achetes par Client");
        System.out.println("0. Quitter");
        return sc.nextInt();
    }

    private static void managePlace(){
        System.out.println("""
                1. Ajouter Lieu
                2. Modifier Lieu
                3. Supprimer Lieu
                0. Retour""");
        int choice=sc.nextInt();
        switch (choice){
                case 1 ->addPlace();
        }
    }

    private static void addPlace(){
        System.out.println("Nom du lieu");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Adresse du lieu");
        String address=sc.nextLine();
        System.out.println("Capacité du lieu");
        int capacity=sc.nextInt();
        Place place=new Place(name,address,capacity);
        places.add(place);
    }

    private static void displayPlace(){
        for (Place place:places) {
            System.out.println(place);
        }
    }

    private static void modifyPlace(){
        displayPlace();
        System.out.println("Tapez le nom du lieu");
        sc.nextLine();
        String name=sc.nextLine();
        Place place=getPlaceByName(name);
        if(place==null){
            System.out.println("Aucun lieu correspondant");
            return;
        }
        System.out.println("Indiquez le nouveau nom/Entrez sans rien tapez pour ne rien modifier");

    }

    private static Place getPlaceByName(String name){
        for (Place place:places) {
            if(place.getName().equals(name))return place;
        }
        return null;
    }
}
