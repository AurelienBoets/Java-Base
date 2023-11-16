package org.example.sort;

import java.util.Scanner;

public class Sort {
    public static void isSort(){
        Scanner scanner=new Scanner(System.in);
        String[] firstNames=new String[3];
        System.out.println("Donner un premier prénom :");
        firstNames[0]=scanner.next();
        System.out.println("Donner un deuxième prénom :");
        firstNames[1]=scanner.next();
        System.out.println("Donner un troisième prénom :");
        firstNames[2]=scanner.next();
        for(int i=0;i<2;i++){
            if(firstNames[i].toLowerCase().compareTo(firstNames[i+1].toLowerCase())>0){
                System.out.println("Les Prénoms ne sont pas dans l'orde alphabétique");
                return;
            }
        }
        System.out.println("Les Prénoms  sont  dans l'orde alphabétique");
    }
}
