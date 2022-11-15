package com.example.CheckingAccount;

public class AccountRepository {
    CheckingAccount account;
    public AccountRepository(){
        account = new CheckingAccount("112233", 200);
    }
    public double withdraw(double amount){
        account.setBalance(account.getBalance() - amount);
        return amount;
    }

    public double deposit(double amount){
        account.setBalance(account.getBalance() + amount);
        return amount;
    }

    public double getBalance(){
        return account.getBalance();
    }
}
