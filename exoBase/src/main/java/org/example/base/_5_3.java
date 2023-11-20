package org.example.base;

import java.util.Scanner;

public class _5_3 {
    public static void whileTen(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Tapez un nombre: ");
        int nb= sc.nextInt();
        int i=1;
        while (i!=11){
            System.out.println(nb+i++);
        }
    }
}
