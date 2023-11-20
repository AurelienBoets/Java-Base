package org.example.array;

import java.util.Arrays;
import java.util.Random;

public class ExoTab5 {
    public static void randomTab(){
        Random rand=new Random();
        int[] tab=new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i]= rand.nextInt(100);
        }
        System.out.println(Arrays.toString(tab));
    }
}
