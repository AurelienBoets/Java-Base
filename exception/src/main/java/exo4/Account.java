package exo4;

public class Account {
    public long balance;
    public Account(){
        this.balance=800;
    }

    public void withDraw(long money) throws InsufficientBalanceException{
        if(money>this.balance) throw new InsufficientBalanceException("Pas assez d'argent");
        System.out.println(this.balance);
    }
}
