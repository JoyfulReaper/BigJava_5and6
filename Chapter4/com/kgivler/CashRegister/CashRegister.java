package com.kgivler.CashRegister;

public class CashRegister
{
    public static final double QUATER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.5;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;

    public CashRegister()
    {
        purchase = 0;
        payment = 0;
    }

    public void recordPurchase(double amount)
    {
        purchase += amount;
    }

    public void enterPayment(int dollars, int quaters, 
        int dimes, int nickels, int pennies)
    {
        payment = dollars + quaters * QUATER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

    public double giveChange()
    {
        double change = payment - purchase;

        if(change < 0)
            throw new IllegalArgumentException("The customer is trying to rip you off!");

        purchase = 0;
        payment = 0;
        return change;
    }
}