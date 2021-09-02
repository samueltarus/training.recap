package com.training.systech.model;

import com.training.systech.BankInterface.Bank;

public class Corporative implements Bank {
    double deposits;
    private double rate =8.0;
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
        if (balance >= amount ) {
            withdrawals +=amount -interestRate(amount);
            System.out.println("Withdrawal amount: " + this.withdrawals);
        } else {
            throw new IllegalArgumentException("Insufficent funds");
        }
    }

    public double interestRate(double amount) {
        double interest = amount * rate/100;
        return interest ;
    }

    public void transactOnAccount(Bank bank) {
        if (bank == null) {
            System.out.println("Unknown ");
        }
        System.out.println("------------------------------");
        System.out.println("Welcome to Corporative Bank Account");
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

    public void printBalance(String message, Bank bank) {
        System.out.println("The balance after " + message + " is " + bank.getBalance() +".");
    }
}
