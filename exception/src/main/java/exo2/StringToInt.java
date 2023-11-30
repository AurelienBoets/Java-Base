package exo2;

public class StringToInt {
    public static Integer converter(String s){
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("Error "+e.getMessage());
            return null;
        }
    }
}
