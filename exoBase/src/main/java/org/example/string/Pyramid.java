package org.example.string;

import java.util.Scanner;

public class Pyramid {
    public static void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("De quelle hauteur voulez vous la pyramide ?");
        int h= sc.nextInt();
        for (int i = 1; i <h ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        for (int i = h; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
}
