package org.example._3_4;

import java.util.Scanner;

public class _3_4 {
    public static void isNegative(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Donnez un nombre : ");
        int nb=sc.nextInt();
        if(nb>0){
            System.out.println("Votre nombre est positif");
        } else if (nb<0) {
            System.out.println("Votre nombre est négatif");
        }else {
            System.out.println("Votre nombre est nulle");
        }
    }
}
