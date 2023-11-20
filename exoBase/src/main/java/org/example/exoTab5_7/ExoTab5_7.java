package org.example.exoTab5_7;

import java.util.Arrays;

public class ExoTab5_7 {
    public static void bubbleSort(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length -(i+1) ; j++) {
                if(tab[j]>tab[j+1]){
                    int max=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=max;
                }
            }
        }
        System.out.println(Arrays.toString(tab));

    }
}
