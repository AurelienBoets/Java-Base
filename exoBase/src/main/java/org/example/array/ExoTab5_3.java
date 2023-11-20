package org.example.array;


public class ExoTab5_3 {
    public static void greatDifference(int[] tab){

        int maxDiff=0;
        int diff=0;
        for (int i = 1; i < tab.length; i++) {
            if(tab[i]>tab[i-1]){
                diff=tab[i]-tab[i-1];
            }else {
                diff=tab[i-1]-tab[i];
            }
            if(maxDiff<diff){
                maxDiff=diff;
            }
        }
        System.out.println("La plus grande différence entre 2 éléments est de "+maxDiff);
    }
}
