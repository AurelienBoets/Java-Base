package org.example.exotab5;

import java.util.Arrays;
import java.util.Random;

public class ExoTab5 {
    public static void randomTab(){
        Random rand=new Random();
        int[] tab=new int[10];
        for (int i:tab
             ) {
            i= rand.nextInt();
        }
        System.out.println(Arrays.toString(tab));
    }
}
