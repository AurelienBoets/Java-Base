package org.example.base;

import java.util.Scanner;

public class Square {
    public static void calc(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Indiquer un nombre à mettre au carré :");
        int nb=scanner.nextInt();
        System.out.println("Le carré de ce nombre est"+ nb*nb);
    }
}
