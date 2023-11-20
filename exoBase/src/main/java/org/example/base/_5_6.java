package org.example.base;

import java.util.Scanner;

public class _5_6 {
    public static void addition(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Tapez un nombre: ");
        int nb= sc.nextInt();
        int result=0;
        for (int i = 0; i <=nb ; i++) {
            result+=i;
        }
        System.out.println(result);
    }
}
