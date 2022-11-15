package com.example.SavingAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

public class CheckingAccountController {
    @Autowired
    AccountRepository accountRepository;
    @GetMapping("/balance")
    public double get(){
        return accountRepository.getBalance();
    }

    @PutMapping("/withdraw/{amount}")
    public double withdraw(@PathVariable double amount){
        return accountRepository.withdraw(amount);
    }

    @PutMapping("/deposit/{amount}")
    public double deposit(@PathVariable double amount){
        return accountRepository.deposit(amount);
    }



}
