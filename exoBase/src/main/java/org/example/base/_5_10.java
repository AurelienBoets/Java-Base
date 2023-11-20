package org.example.base;

import java.util.Scanner;

public class _5_10 {
    public static void shop (){
        Scanner sc=new Scanner(System.in);
        float total=0;
        while(true){
            System.out.println("Indiquez le prix du produit, tapez 0 pour quittez");
            float price=sc.nextFloat();
            if(price==0){
                break;
            }
            total+=price;
        }
        System.out.printf("""
        Le client doit payer %.2f€
        """,total);
        System.out.println("Indiquez ce que le client a donné: ");
        float nb=sc.nextFloat();
        System.out.printf("""
    Vous devez rendre %.2f€
    """,nb-total);
    }
}
