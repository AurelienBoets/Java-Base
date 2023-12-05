package org.example.exoStream;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        String s="Ceci est un texte à filtrer, ce texte a 3 occurences du mot texte  ";
        String[] words = s.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String,Long> wordsCounting=new HashMap<>(Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println("Fréquence des mots :");
        wordsCounting.forEach((word, count) -> System.out.println(word + ": " + count));
        System.out.println();
        System.out.println("Mot de longueur égale ou supérieur à 5");
        System.out.println();
        Arrays.stream(words).filter(word->word.length()>=5).forEach(System.out::println);
        System.out.println();
        Arrays.stream(words).distinct().forEach(System.out::println);
        System.out.println();
        long max=0;
        String frequentWord="";
        for (String key:wordsCounting.keySet()) {
            if(wordsCounting.get(key)>max){
                max=wordsCounting.get(key);
                frequentWord=key;
            }
        }
        System.out.println("Le mot le plus fréquent est "+frequentWord);
        System.out.println();
        long average=0;
        long min=10000;
        long maxLength=0;
        String maxWord="";
        String minWord="";
        for (String key:wordsCounting.keySet()) {
            average+=key.length();
            if(key.length()<min){
                minWord=key;
                min=key.length();
            }
            if(key.length()>maxLength){
                maxLength=key.length();
                maxWord=key;
            }
        }
        average/=wordsCounting.size();
        System.out.println("La longueur moyenne est de "+average);
        System.out.println("Le mot le plus long est "+maxWord);
        System.out.println("Le mot le moins long est "+minWord);

    }
}
