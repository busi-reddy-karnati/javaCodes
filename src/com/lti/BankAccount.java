package com.lti;

/**
 * Created by busis on 2020-12-02.
 */
public class BankAccount {
    private double withdrawAmount;
    private double depositAmount;
    private double interestRate=9.5;
    private double balance;
    public void depositMoney(){
        System.out.println("Money deposited: "+depositAmount);
        setBalance(getBalance() + getDepositAmount());
        printBalance();

    }
    public void withdrawMoney(){
        System.out.println("Money withdrawn: "+withdrawAmount);
        setBalance(getBalance() - getWithdrawAmount());
        printBalance();
    }
    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void printBalance(){
        System.out.println("Available Balance: "+getBalance());
    }
}

class SeniorCitizen extends BankAccount{
    public void applyFixedDeposit(){
        setInterestRate(10.5);
    }
}
class NRIAccount extends BankAccount{
    public void applyFixedDeposit(){
        setInterestRate(6.5);
    }

}


/*
*Although I put the name of the file as BankAccount, it worked, which ideally should be the name of class
* that holds the main method
* */
class InheritanceDemo{
    public static void main(String args[]){
        NRIAccount nriAccount = new NRIAccount();
        nriAccount.setBalance(10000);
        nriAccount.setWithdrawAmount(4000);
        nriAccount.setDepositAmount(5000);
        nriAccount.depositMoney();
        nriAccount.withdrawMoney();
        nriAccount.applyFixedDeposit();
        SeniorCitizen seniorCitizen = new SeniorCitizen();
        seniorCitizen.setBalance(9000);
        seniorCitizen.setWithdrawAmount(4000);
        seniorCitizen.setDepositAmount(5000);
        seniorCitizen.depositMoney();
        seniorCitizen.withdrawMoney();
        seniorCitizen.applyFixedDeposit();
    }
}