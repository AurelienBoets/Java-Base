package exo3;

public class Main {
    public static void exceptionArray(){
        int[] tab={1,2,3,4,5};
        try{
            System.out.println(tab[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main.exceptionArray();
    }
}
