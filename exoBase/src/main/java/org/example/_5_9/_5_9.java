package org.example._5_9;

import java.util.Scanner;

public class _5_9 {
    public static void facto(){
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("""
            Tapez un nombre, tapez 0 pour quitter
            """);
            int nb= sc.nextInt();
            if(nb==0){
                return;
            }
            int result=1;
            for (int i = 1; i <=nb ; i++) {
                result*=i;
            }
            System.out.printf("""
        La factorielle de %d est %d
        """,nb,result);
        }
    }}
