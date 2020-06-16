package com.kgivler.Account;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
    private double balance;
    private int accountNumber;

    public BankAccount()
    {
        this(0, 0);
    }

    public BankAccount(double amount)
    {
        this (amount, 0);
    }

    /**
     * Construct a bank account with an initial balance 
     * and account number.
     * @param amount Initial balance
     * @param accountNumber Account number
     */
    public BankAccount(double amount, int accountNumber)
    {
        balance = amount;
        this.accountNumber = accountNumber;
    }

    /**
     * Deposit Money to the Bank Account.
     * @param amount The deposit amount
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * Withdraws money from the bank account.
     * @param amount the amount to withdraw.
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    /**
     * Gets the current balance of the bank account.
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Get the account number of the bank account
     * @return the account number
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * Add interest to the bank account
     * @param percent Amount of interest to add
     */
    public void addInterest(double percent)
    {
        balance += (percent / 100) * balance;
    }
}