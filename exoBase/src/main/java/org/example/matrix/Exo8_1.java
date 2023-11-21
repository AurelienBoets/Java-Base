package org.example.matrix;

public class Exo8_1 {
    public static void searchGreatNumber(int[][] tab){
        int max=tab[0][0];
        for (int i = 0; i <tab.length ; i++) {
            for (int j:
                 tab[i]) {
                if(j>max){
                    max=j;
                }
            }
        }
        System.out.println("La valeur la plus grande de la matrice est "+max);
    }
}
