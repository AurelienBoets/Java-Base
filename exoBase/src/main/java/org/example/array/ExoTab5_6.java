package org.example.array;

import java.util.Arrays;

public class ExoTab5_6 {
    public static void selectionSort(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            int min=tab[i];
            int index=i;
            for (int j = i; j <tab.length ; j++) {
                if(tab[j]<min){
                    min=tab[j];
                    index=j;
                }
            }
            tab[index]=tab[i];
            tab[i]=min;
        }
        System.out.println(Arrays.toString(tab));
    }
}
