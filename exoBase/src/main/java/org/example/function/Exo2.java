package org.example.function;

import java.util.Scanner;

public class Exo2 {
    private static void drawRectangle(int h,int l){
        for (int i = 0; i <l ; i++) {
            System.out.print("*");
        }
        for (int j = 2; j <h ; j++) {
            System.out.print("\n*");
            for (int i = 2; i <l ; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <l ; i++) {
            System.out.print("*");
        }
    }

    public static void inputDim(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indiquez la hauteur du rectangle");
        int h= sc.nextInt();
        System.out.println("Indiquez la longueur du rectangle");
        int l= sc.nextInt();
        if(h>=2 && l>=2){
            drawRectangle(h,l);
        }else {
            System.out.println("Les dimensions sont trop petites");
        }
    }
}
