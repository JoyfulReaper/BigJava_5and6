package com.kgivler.CashRegister;

public class CashRegisterTester {
    public static void main(String[] args)
    {
        CashRegister register = new CashRegister();
    
        register.recordPurchase(1.00);
        register.recordPurchase(2.50);
        register.enterPayment(5, 0, 0, 0, 1);
        double change = register.giveChange();
        System.out.printf("%.2f", change);
    }

}