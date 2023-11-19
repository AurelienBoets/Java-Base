package org.example.exotab3;

import java.util.Scanner;

public class ExoTab3 {
    public static void searchInt(){
        int[] tab={10,20,30,40,50,60,70,80};
        Scanner sc=new Scanner(System.in);
        System.out.println("Indiquez un nombre");
        int nb=sc.nextInt();
        for (int j : tab) {
            if (nb == j) {
                System.out.printf("""
                        La valeur %d est présente dans le tableau""", nb);
                return;
            }
        }
        System.out.printf("""
                 La valeur %d n'est pas présente dans le tableau""",nb);
    }
}
