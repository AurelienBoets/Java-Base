package org.example.string;

public class CountWord {
    public static void countWord(String s){
       String[] tab= s.split(" ");
        System.out.printf("""
                Il y a %d mot(s) dans la chaine de caractères
                """,tab.length);
    }
}
