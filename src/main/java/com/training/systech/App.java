package com.training.systech;

import com.training.systech.BankInterface.Bank;
import com.training.systech.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Implementation of Interfaces");
        Bank bank = new Kcb();
        System.out.println("Transacting using KCB  Bank Account");
        bank.transactOnAccount(bank);
        System.out.println();

        bank = new Equity();
        System.out.println("Transacting using Equity Bank Account");
        bank.transactOnAccount(bank);
        System.out.println();

        bank = new BoreshaSacco();
        System.out.println("Transacting using Boresha Sacco  Bank Account");
        bank.transactOnAccount(bank);
        System.out.println();

        bank = new Corporative();
        System.out.println("Transacting using Corporate Bank Account");
        bank.transactOnAccount(bank);
        System.out.println();

        bank = new StandardBank();
        System.out.println("Transacting using Standard Bank Account");
        bank.transactOnAccount(bank);
    }
}
