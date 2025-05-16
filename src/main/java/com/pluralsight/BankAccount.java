package com.pluralsight;

public class BankAccount implements IValuable{

    String acctNum;
    double balance;


    public BankAccount(String acctNum, double balance) {
        this.acctNum = acctNum;
        this.balance = balance;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int getValue() {
        return 0;
    }
}
