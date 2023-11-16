package org.example._3_7;

import java.util.Scanner;

public class _3_7 {
    public static void photocopy(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indiquez le nombre de photocopie: ");
        int nb=sc.nextInt();
        float price=0;
        if(nb>20){
            price=nb*5f;
        } else if (nb>=10) {
            price=nb*10f;
        } else if (nb<0) {
            System.out.println("Indiquez une valeur valide");
            return;
        }else{
            price=nb*15f;
        }
        System.out.printf("Pour %d photocopie, cela vous coutera %.2f$",nb,price/100);
    }
}
