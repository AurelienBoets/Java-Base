package tpException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private static Scanner sc=new Scanner(System.in);

    public static void start(){
        int choice;
        List<Integer> list=new ArrayList<>();
        do {
            System.out.println("Tapez un nombre \n Tapez 0 pour quittez");
            try{
                choice= sc.nextInt();
                if(choice!=0){
                    list.add(choice);
                }

            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println(e.getMessage());
                choice=1;
            }
        }while(choice!=0);

        try{
            System.out.println("Le résultat est: "+sumArray(list));
        }catch (EmptyArrayException e){
            System.out.println(e.getMessage());
        }
    }

    private static Integer sumArray(List<Integer> list) throws EmptyArrayException {
        if (list.isEmpty()) throw new EmptyArrayException("La liste est vide");
        Integer result = 0;
        for (Integer i : list) {
            result += i;
        }
        return result;
    }
}
