package org.example.array;

import java.util.Random;

public class ExoTab6 {
    public static void tabRand(){

    Random rand=new Random();
    int[] tab1={rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt()};
    int[] tab2={rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt(), rand.nextInt()};
    int result=0;
        for (int i = 0; i < tab1.length; i++) {
            result+=tab1[i]+tab2[i];
        }
        System.out.println("Le résultat de la somme des 2 tableaux est de "+ result);
    }
}