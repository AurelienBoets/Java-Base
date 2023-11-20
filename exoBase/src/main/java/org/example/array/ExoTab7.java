package org.example.array;

import java.util.Arrays;
import java.util.Random;

public class ExoTab7 {
    public static void searchGreatNumber(){
        Random rand=new Random();
        int[] tab=new int[10];
        int max=0;
        for (int i = 0; i < tab.length; i++) {
            tab[i]= rand.nextInt();
        }
        for (int i:tab
        ) {
            if(max<i){
                max=i;
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("Le plus grand nombre est "+max);
    }
}
