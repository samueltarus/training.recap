package com.training.systech.model;

import com.training.systech.BankInterface.Bank;

public class Kcb  implements Bank {
    private double balance;
    private double rate =10;
    double deposits;
    double withdrawals;



    public double getBalance() {

        return deposits-withdrawals;
    }

    public void deposit(double amount) {
        double balance = getBalance();
        deposits +=amount + interestRate(amount);
        System.out.println("Deposited amount: " + amount);
    }
    public void withdraw(double amount) {
        double balance = getBalance();
        if (balance >= amount) {
            withdrawals +=amount -interestRate(amount);
            System.out.println("Withdrawal amount: " + this.withdrawals);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }


    }

    public double interestRate(double amount) {
        double interest = amount * rate/100;
        return interest ;
    }

    public void transactOnAccount(Bank bank) {
        if (bank == null) {
            System.out.println("Unknown Bank");
        }
        else {
            System.out.println("Welcome to KCB Bank");
            bank.deposit(500.0);
            printBalance("depositing 500.0", bank);
            bank.withdraw(100.0);
            printBalance("withdrawing 100.0", bank);
            bank.withdraw(50.0);
            printBalance("withdrawing 50.0", bank);
            bank.deposit(1000.0);
            printBalance("depositing 1,000.0", bank);
            System.out.println("------------------------------");
        }
    }

    public void printBalance(String message, Bank bank) {
        System.out.println("The balance after " + message + " is " + bank.getBalance() +".");
    }
}
