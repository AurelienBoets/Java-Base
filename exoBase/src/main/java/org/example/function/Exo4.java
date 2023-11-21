package org.example.function;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exo4 {
    private static String[] filterWordsByLength(int minLength, String[] words) {
        String filterWords="";
        for(String i:words){
            if(i.length()>minLength){
                filterWords+=i+" ";
            }
        }
        return filterWords.trim().split(" ");
    }

    public static void inputWords(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Tapez des mots");
        String words= sc.nextLine();
        System.out.println("Tapez un nombre qui définira la taille minimale des mots qui seront filtrés");
        int minLength=sc.nextInt();
        String[] wordsTab=words.split(" ");
        System.out.println(Arrays.toString(filterWordsByLength(minLength, wordsTab)));
    }
}
