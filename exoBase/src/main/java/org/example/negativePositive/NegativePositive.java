package org.example.negativePositive;

import java.util.Scanner;

public class NegativePositive {
    public static void isNegative(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Donner un nombre :");
        int nb1=scanner.nextInt();
        System.out.println("Donner un  deuxième nombre :");
        int nb2=scanner.nextInt();
        if(nb1*nb2>=0){
            System.out.println("Votre nombre est positif");
        }else{
            System.out.println("VOtre nombre est négatif");
        }
    }
}
