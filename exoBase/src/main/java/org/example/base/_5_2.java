package org.example.base;

import java.util.Scanner;

public class _5_2 {
    public static void chooseNumber(){
        Scanner sc=new Scanner(System.in);
        int nb=0;
        while (nb<10 || nb>20){
            System.out.println("Choississez un nombre: ");
            nb= sc.nextInt();
            if(nb<10){
                System.out.println("Plus grand !");
            } else if (nb>20) {
                System.out.println("Plus petit !");
            }
        }
    }
}
