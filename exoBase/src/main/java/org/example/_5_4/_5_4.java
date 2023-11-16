package org.example._5_4;

import java.util.Scanner;

public class _5_4 {
    public static void forTen(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Tapez un nombre: ");
        int nb= sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(nb+i);
        }
    }
}
