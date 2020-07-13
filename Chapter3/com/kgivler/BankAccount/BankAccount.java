package com.kgivler.BankAccount;

import java.math.BigDecimal;

/**
 * A bank account has a balance the can be changed by
 * deposits and withdrawals.
 */
public class BankAccount
{
    private BigDecimal balance;
    private BigDecimal transactionFee = new BigDecimal(1);
    private int transactions = 0;
    private int complimentaryTransactions = 3;

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

        transactions++;
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
        
        transactions++;
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
        return getClass().getName() + "[balance=" + balance.doubleValue() + ",transactions=" + transactions + 
            ",transactionFee=" + transactionFee.doubleValue() + ",ComplimentaryTransactions=" + complimentaryTransactions + "]";
    }

    /**
     * Set the per transaction fee for this BankAccount
     * @param transactionFee the per transaction fee
     */
    public void setTransactionFee(double transactionFee)
    {
        setTransactionFee(new BigDecimal(transactionFee));
    }

    /**
     * Set the per transaction fee for this BankAccount
     * @param transactionFee the per transaction fee
     */
    public void setTransactionFee(BigDecimal transactionFee)
    {
        if (transactionFee.doubleValue() < 0)
            throw new IllegalArgumentException("transactionFee must be positive");

        this.transactionFee = transactionFee;
    }

    /**
     * Get the per transaction fee for this BankAccount
     * as a double
     * @return The per transaction fee
     */
    public double getTransactionFeeAsDouble()
    {
        return transactionFee.doubleValue();
    }

    /**
     * Get the per transaction fee for this BankAccount
     * @return The per transaction fee
     */
    public BigDecimal getTransactionFee() 
    {
        return transactionFee;
    }

    public void setComplimentaryTransactions(int num)
    {
        this.complimentaryTransactions = num;
    }

    public int getComplimentaryTransactions()
    {
        return complimentaryTransactions;
    }

    /**
     * Deduct the transaction fees from this BankAccount for the month
     * and reset the transaction count. Should only be called on the last day of the month.
     */
    public void deductMonthlyCharge()
    {
        if(transactions > complimentaryTransactions)
            balance = balance.subtract(BigDecimal.valueOf( (transactions - complimentaryTransactions) * transactionFee.doubleValue()));

        transactions = 0;
    }
}
