package org.example._5_5;

import java.util.Scanner;

public class _5_5 {
    public static void tableMultiplicity(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Tapez un nombre: ");
        int nb= sc.nextInt();
        for (int i = 0; i <=10 ; i++) {
            System.out.printf("""
                    %d x %d =%d
                    """,nb,i,nb*i);

        }
    }
}
