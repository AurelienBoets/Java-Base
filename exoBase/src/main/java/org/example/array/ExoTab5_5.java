package org.example.array;

import java.util.Arrays;

public class ExoTab5_5 {
    public static void reverseTab(int[] tab){
        int[] newArray=new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            newArray[i]=tab[tab.length-(i+1)];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
