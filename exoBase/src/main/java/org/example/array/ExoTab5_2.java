package org.example.array;

public class ExoTab5_2 {
    public static void isCroissant(int[] tab){


    int oldNb=0;
        for (int i = 0; i < tab.length; i++) {
            if(i!=0){
                if(tab[i]<oldNb){
                    System.out.println("Le tableau n'est pas trié dans l'ordre");
                    return;
                }
            }
            oldNb=tab[i];
        }
        System.out.println("Le tableau est trié dans l'ordre");
    }

}
