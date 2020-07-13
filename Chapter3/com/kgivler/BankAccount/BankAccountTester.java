package com.kgivler.BankAccount;

public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(0);

        account.deposit(10);
        account.deposit(100);
        account.deposit(1);

        account.withdraw(1);

        System.out.printf("Account contains: %.2f\n",  account.getBalanceAsDouble());
        System.out.println(account);

        account.deductMonthlyCharge();
        System.out.printf("Account contains: %.2f\n",  account.getBalanceAsDouble());
        System.out.println(account);
    }
}