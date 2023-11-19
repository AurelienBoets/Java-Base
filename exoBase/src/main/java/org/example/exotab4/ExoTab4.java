package org.example.exotab4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExoTab4 {
    public static void isEvent() {
    ArrayList<Integer> tab=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    while(true){


            System.out.println("Indiquez un nombre; tapez 0 pour quittez");
            int nb= sc.nextInt();
            if (nb==0){
                break;
            }
            tab.add(nb);
        }
        for (int i:tab
             ) {
            if(i%2!=0){
                System.out.println("Tous les membres du tableau ne sont pas pairs");
                return;
            }
        }
        System.out.println("Tous les membres du tableau sont pairs");
    }

}
