package org.example.array;

import java.util.Arrays;

public class ExoTab1 {
    public static void tab5(){
        int[] tab=new int[5];
        for (int i = 0; i < 5; i=i) {
            tab[i]=++i;
        }
        System.out.println(Arrays.toString(tab));
    }
}
