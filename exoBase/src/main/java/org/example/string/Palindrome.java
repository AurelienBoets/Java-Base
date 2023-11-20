package org.example.string;

import java.util.Arrays;

public class Palindrome {
    public static void isPalindrome(String s){
        String[] tab=s.split("");
        String[] newArray=new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            newArray[i]=tab[tab.length-(i+1)];
        }
        if(Arrays.equals(tab,newArray)) {
            System.out.printf("""
                    Le mot %s est un palindrome
                    """, s);
        }else {
            System.out.printf("""
                    Le mot %s n'est pas un palindrome
                    """, s);
        }
    }
}
