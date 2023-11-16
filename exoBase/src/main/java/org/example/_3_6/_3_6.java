package org.example._3_6;

import java.util.Scanner;

public class _3_6 {
    public static void isDivisibleThree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indiquez un entier: ");
        int nb= sc.nextInt();
        if(nb%3==0){
            System.out.println("Votre nombre est divisible par 3");
            return;
        }
        System.out.println("Votre nombre n'est pas divisible par 3");
    }
}
