package org.example.base;

import java.util.Scanner;

public class Bonjour {
    public static void bonjour(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String prenom=scanner.next();
        System.out.println("Bonjour, "+prenom);
    }
}
