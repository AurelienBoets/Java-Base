package org.example.base;

public class _5_11 {
    public static void upperHundred(){
        int result=0;
        int i=0;
        int n=0;
        while(true){
            result+=++i;
            if(result>100){
                n=i;
                break;
            }
        }
        System.out.printf("A partir de %d, la somme des entiers précédent dépasse 100",n);
    }
}
