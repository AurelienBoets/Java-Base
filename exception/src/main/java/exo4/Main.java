package exo4;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.withDraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
