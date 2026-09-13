package com.joysistvi.stage2.discussion.day20;

public class CashPayment extends Payment{
    double amount;

    public CashPayment(double balance) {
        super(balance);

    }

    void pay(double balance) {
        System.out.println("Paid "+ amount +"Using Cash Payment");
    }
}
