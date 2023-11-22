package org.example.tpHeritage3;

public class Account {
    static int count=1;
    protected int code;
    protected double balance;

    public Account(double balance){
        this.balance=balance;
        this.code=count++;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void add(double money){
        setBalance(this.balance+money);
    }

    public void debit(double money){
        setBalance(this.balance-money);
    }

    @Override
    public String toString() {
        return String.format("""
                Votre code est %d
                Votre solde est de %.2f€
                """,this.code,this.balance);
    }
}
