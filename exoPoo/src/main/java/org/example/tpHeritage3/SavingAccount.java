package org.example.tpHeritage3;

public class SavingAccount extends Account{

    private float interestRate;
    public SavingAccount(double balance,float interestRate) {
        super(balance);
        this.interestRate=interestRate;
    }

    public void interestRateCalcultaion(){
        this.balance*=(interestRate/100+1);
    }

    public String toString() {
        return super.toString()+String.format("Votre taux d'intérêts est à %.2f%%\n",this.interestRate);
    }
}
