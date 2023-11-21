package org.example.matrix;

import java.util.Arrays;

public class Exo8_2 {
    public static void setMatrix(int[][] matrix) {
        int cnt = 1;
        float addition = 0;
        int sum=1;
        for (int[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                addition += cnt;
                sum*=cnt;
                i[j] = cnt++;
            }
        }
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        float average = addition / (cnt - 1);
        System.out.printf("La somme de cette matrice est de %.0f \n" , addition);
        System.out.printf("La moyenne de cette matrice est de %.2f \n", average);
        System.out.println("La somme total est de "+sum);
    }
}
