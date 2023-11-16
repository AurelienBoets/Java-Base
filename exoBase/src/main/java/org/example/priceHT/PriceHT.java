package org.example.priceHT;

import java.util.Scanner;

public class PriceHT {
    public static void calcPrice(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Indiquer le prix de l'article :");
        double price=scanner.nextDouble();
        System.out.println("Indiquer le nombre d'article :");
        int nb=scanner.nextInt();
        System.out.println("Indiquer le taux de TVA :");
        double t=scanner.nextDouble();
        double ttc=price*(t/100+1)*nb;
        System.out.printf(""" 
                Le prix Ht est de %f 
                Le nombre est de %d
                La TVA est de %f
                Le prix total est de %f
                """,price,nb,t,ttc);
    }
}
