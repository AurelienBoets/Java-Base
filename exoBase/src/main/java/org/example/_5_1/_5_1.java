package org.example._5_1;

import java.util.Scanner;

public class _5_1 {
    public static void chooseNumber(){
        Scanner sc=new Scanner(System.in);
        int nb=0;
        while (nb<1 || nb>3){
            System.out.println("Choississez un nombre: ");
            nb= sc.nextInt();
        }
    }
}
