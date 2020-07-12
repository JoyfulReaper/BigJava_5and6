package com.kgivler.BankAccount;

public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(0);
        account.deposit(10);
        System.out.println("Account contains: " + account.getBalanceAsDouble());
        System.out.println(account);
    }
}