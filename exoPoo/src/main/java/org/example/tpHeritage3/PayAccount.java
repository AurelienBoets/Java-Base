package org.example.tpHeritage3;

public class PayAccount extends Account{
    public PayAccount(double balance) {
        super(balance);
    }

    @Override
    public void add(double money) {
        super.add(money*0.95);
    }

    @Override
    public void debit(double money) {
        super.debit(money*1.05);
    }
}
