package org.example.exoStream;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String s="Ceci est un texte à filtrer, ce texte a 3 occurences du mot texte";
        String[] words = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String,Long> wordsCounting=new HashMap<>(Arrays.stream(words).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting())));
        System.out.println("Fréquence des mots :");
        wordsCounting.forEach((mot, frequence) -> System.out.println(mot + ": " + frequence));
    }
}
