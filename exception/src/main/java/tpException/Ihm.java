package tpException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> list = new ArrayList<>();

    public static void start() {


        try {
            chooseNumber();
            System.out.println("Le résultat est: " + sumArray(list));
        } catch (EmptyArrayException e) {
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

    private static void chooseNumber() {
        int choice = 5;

            System.out.println("Tapez un nombre \n Tapez 0 pour quittez");
            try {
                choice = sc.nextInt();
                if (choice != 0) {
                    list.add(choice);
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
            }finally {
                if(choice!=0){
                    chooseNumber();
                }
            }
    }


}