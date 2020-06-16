package com.kgivler.Account;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class SavingsAccount
{
    private double balance;
    private double interestRate;


    /**
     * Construct a bank account with an initial balance 
     * and account number.
     * @param amount Initial balance
     * @param accountNumber Account number
     */
    public SavingsAccount(double amount, int interestRate)
    {
        balance = amount;
        this.interestRate = interestRate;
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
     * Add interest to the bank account
     */
    public void addInterest()
    {
        balance += (interestRate / 100) * balance;
    }
}
