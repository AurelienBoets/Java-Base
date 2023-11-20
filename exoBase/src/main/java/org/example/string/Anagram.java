package org.example.string;

import java.util.Arrays;

public class Anagram {
    public static void isAnagram(String s1,String s2){
        String[] tab1=s1.split("");
        String[] tab2=s2.split("");
        Arrays.sort(tab1);
        Arrays.sort(tab2);
        if(Arrays.equals(tab1, tab2)){
            System.out.println("Les 2 mots sont des anagrammes");
        }else{
            System.out.println("Les 2 mots ne sont pas des anagrammes");
        }
    }
}
