package org.example.string;

public class CountN {
    public static void countN(String s,char n){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==n){
                count++;
            }
        }
        System.out.printf("""
                Il y a %d fois la lettre %c dans la chaîne de caratéres
                """,count,n);
    }
}
