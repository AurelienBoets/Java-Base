package org.example.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Exo8_3 {
    public static void sellVehicle(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Indiquez le nombre de marque: ");
        int nbVehicle=sc.nextInt();
        System.out.println("Indiquez le nombre de vendeur");
        int nbSeller= sc.nextInt();
        String[] seller=new String[nbSeller];
        for (int i = 0; i <seller.length ; i++) {
            System.out.println("Indiquez le nom du vendeur " + (i+1) +": ");
            seller[i]=sc.next();
        }
        String[] vehicle=new String[nbVehicle];
        for (int i = 0; i <vehicle.length ; i++) {
            System.out.println("Indiquez le nom de la marque " + (i+1) +": ");
            vehicle[i]=sc.next();
        }
        int[][]matrix=new int[nbSeller][nbVehicle];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.printf("Indiquez pour %s le nombre de %s vendus: \n",seller[i],vehicle[j]);
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.printf("%-15s", "");


        for (String v : vehicle) {
            System.out.printf("%-15s", v);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%-15s", seller[i]);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-15d", matrix[i][j]);
            }

            System.out.println();
        }
    }
}
