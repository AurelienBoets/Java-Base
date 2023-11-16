package org.example._3_5;

import java.util.Scanner;

public class _3_5 {
    public static void categoryChild(){
        System.out.println("Donnez l'age de votre enfant: ");
        Scanner sc=new Scanner(System.in);
        int old=sc.nextInt();
        if(old<6){
            System.out.println("Votre enfant ne rentre dans aucune catégorie");
            return;
        }

        switch (old){
            case 6:
            case 7:
                System.out.println("Catégorie Poussin");
                break;
            case 8 :
            case 9 :
                System.out.println("Pupille");
                break;
            case 10:
            case 11 :
                System.out.println("Catégorie Minime");
                break;
            default:
                System.out.println("Catégorie Cadet");
                break;
        }
    }
}
