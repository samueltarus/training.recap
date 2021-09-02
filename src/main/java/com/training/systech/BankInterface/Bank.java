package com.training.systech.BankInterface;

public interface Bank {
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    double interestRate(double amount);
    void transactOnAccount(Bank bank);
    void printBalance(String message, Bank bank);

}
