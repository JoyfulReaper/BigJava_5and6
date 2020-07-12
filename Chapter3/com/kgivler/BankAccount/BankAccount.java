package com.kgivler.BankAccount;

import java.math.BigDecimal;

/**
 * A bank account has a balance the can be changed by
 * deposits and withdrawals.
 */
public class BankAccount
{
    private BigDecimal balance;
    private BigDecimal transactionFee;

    /**
     * Construct a BankAccount with a zero balance.
     */
    public BankAccount()
    {
        this(0);
    }

    /**
     * Create a BankAccount with the given balance.
     * @param initalBalance initial balance
     */
    public BankAccount(double initalBalance)
    {
        this(new BigDecimal(initalBalance));
    }

    /**
     * Create a BankAccount with the given balance.
     * @param initalBalance initial balance
     */
    public BankAccount(BigDecimal initalBalance)
    {
        balance = initalBalance;
    }

    /**
     * Deposit into this BankAccount
     * @param amount amount to deposit
     */
    public void deposit(double amount)
    {
        deposit(new BigDecimal(amount));
    }

    /**
     * Deposit into this BankAccount
     * @param amount amount to deposit
     */
    public void deposit(BigDecimal amount)
    {
        if (amount.doubleValue() < 0)
            throw new IllegalArgumentException("amount cannot be negative.");

        balance = balance.add(amount);
    }

    /**
     * Withdraw from this BankAccount
     * @param amount amount to withdraw
     */
    public void withdraw(double amount)
    {
        withdraw(new BigDecimal(amount));
    }

     /**
     * Withdraw from this BankAccount
     * @param amount amount to withdraw
     */
    public void withdraw(BigDecimal amount)
    {
        if(amount.doubleValue() < 0)
            throw new IllegalArgumentException("amount cannot be negative.");
        
        balance = balance.subtract(amount);
    }

    /**
     * Get this BankAccount's balance
     * @return the balance
     */
    public BigDecimal getBalance()
    {
        return balance;
    }

    /**
     * Get this BankAccount's balance as a double
     * @return the balance as a double
     */
    public double getBalanceAsDouble()
    {
        return balance.doubleValue();
    }

    /**
     * @return a string representation of this BankAccount
     */
    public String toString()
    {
        return getClass().getName() + "[balance=" + balance.doubleValue() + "]";
    }

    public void setTransactionFee(double transactionFee)
    {
        setTransactionFee(new BigDecimal(transactionFee));
    }

    public void setTransactionFee(BigDecimal transactionFee)
    {
        if (transactionFee.doubleValue() < 0)
            throw new IllegalArgumentException("transactionFee must be positive");

        this.transactionFee = transactionFee;
    }

    public double getTransactionFeeAsDouble()
    {
        return transactionFee.doubleValue();
    }

    public BigDecimal getTransactionFee() 
    {
        return transactionFee;
    }
}
