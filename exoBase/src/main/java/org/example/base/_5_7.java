package org.example.base;

import java.util.Scanner;

public class _5_7 {
    public static void tenNumber(){
        Scanner sc =new Scanner(System.in);
        int nb;
        int i=0;
        int max=0;
        int position = 0;
        while (i!=10) {
            i++;
            System.out.println(i+ " Tapez un nombre: ");
            nb = sc.nextInt();
            if(nb>max) {
                max = nb;
                position = i;
            }

        }
        System.out.printf("""
                Le plus grand nombre été %d
                Il est numéro %d
                """,max,position);
    }
}
