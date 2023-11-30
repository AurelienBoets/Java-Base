package exo1;

public class Math {
    public static Long division(Integer a,Integer b){
        try{
            return (long) (a/b);
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
}
