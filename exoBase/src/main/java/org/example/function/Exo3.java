package org.example.function;

import java.util.Scanner;

public class Exo3 {
    private static int getWordsAmount(String str){
        String[] tab=str.trim().split(" ");
        return tab.length;
    }

    public static void countWord(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Tapez une phrase");
        String str=sc.nextLine();
        System.out.printf("Il y a %d mots dans la phrase",getWordsAmount(str));
    }
}
