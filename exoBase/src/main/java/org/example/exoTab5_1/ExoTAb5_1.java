package org.example.exoTab5_1;

import java.util.Random;
import java.util.Scanner;

public class ExoTAb5_1 {
    public static void shearchN(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Indiqué un nombre");
        int nb= sc.nextInt();
        int[] tab={rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt()};
        int n=0;
        for (int i:
             tab) {
            if(i==nb){
                n++;
            }
        }
        System.out.printf("""
                Il y %d fois %d dans le tableau
                """,n,nb);
    }
}
