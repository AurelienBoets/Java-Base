package org.example.array;

import java.util.Arrays;

public class ExoTab5_8 {
    public static void sumTab(int[][] tab1, int[][] tab2){
        if(tab1.length!= tab2.length){
            System.out.println("Les tableaux n'ont pas la même longueur");
            return;
        }
        int[][] newArray=new int[tab1.length][tab1[0].length];
        for (int i = 0; i < tab1.length; i++) {
            if(tab1[i].length!=tab1[0].length || tab2[i].length!=tab1[0].length ){
                System.out.println("Les tableaux ne sont pas réguliers");
                return;
            }
            for (int j = 0; j < tab1[i].length; j++) {
                newArray[i][j]=tab1[i][j]+tab2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArray));
    }
}
