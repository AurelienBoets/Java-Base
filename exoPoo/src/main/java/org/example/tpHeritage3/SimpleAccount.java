package org.example.tpHeritage3;

public class SimpleAccount extends Account {

    private double overdraft;

    public SimpleAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = overdraft;
    }

    @Override
    public void debit(double money) {
        if (this.balance - money >= this.overdraft) {
            super.debit(money);
        }else{
            System.out.println("Votre découvert vous empeche de faire cette opération");
        }
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Votre découvert est à %.2f\n",this.overdraft);
    }
}
