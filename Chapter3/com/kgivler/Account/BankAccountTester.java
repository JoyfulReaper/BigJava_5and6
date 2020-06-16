package com.kgivler.Account;

/**
 * A class to test the BankAccount class.
 */
public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        b1.withdraw(500);
        System.out.println(b1.getBalance());
        System.out.println("Expected: 500");

        BankAccount b2 = new BankAccount(1000);
        b2.addInterest(10);
        System.out.println(b2.getBalance());
        System.out.println("Expected: 1100");
    }
}