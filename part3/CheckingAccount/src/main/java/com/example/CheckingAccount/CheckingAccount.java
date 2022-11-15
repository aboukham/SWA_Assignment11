package com.example.CheckingAccount;

public class CheckingAccount {
    private String accNum;
    private double balance;

    public CheckingAccount(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accNum='" + accNum + '\'' +
                ", balance=" + balance +
                '}';
    }
}
