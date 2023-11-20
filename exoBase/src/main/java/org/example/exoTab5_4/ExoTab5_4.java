package org.example.exoTab5_4;

import java.util.Arrays;

public class ExoTab5_4 {
    public static void decal(int[] tab ){
       int[] newArray=new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if(i== tab.length-1){
                newArray[0]=tab[i];
            }else{
                newArray[i+1]=tab[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
