package org.example._5_8;

import java.util.Scanner;

public class _5_8 {
    public static void facto(){
        Scanner sc=new Scanner(System.in);
        System.out.println("""
                Tapez un nombre
                """);
        int nb= sc.nextInt();
        int result=1;
        for (int i = 1; i <=nb ; i++) {
            result*=i;
        }
        System.out.printf("""
    La factorielle de %d est %d
    """,nb,result);
    }
}
