package org.example.function;

import java.util.Arrays;
import java.util.Scanner;

public class Exo1 {


    private static Integer getMaxNumber(int[] tab){
        int max=tab[0];
        for (int i:tab) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static void createTab(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indiquez plusieurs nombres en les séparant par un espace");
        String input=sc.nextLine();
        String[] strNumbers=input.split(" ");
        int[] numbers=new int[strNumbers.length];
        for (int i = 0; i <strNumbers.length ; i++) {
            numbers[i]=Integer.parseInt(strNumbers[i]);
        }
        System.out.println(getMaxNumber(numbers));
        System.out.println(Arrays.toString(numbers));
    }
}
