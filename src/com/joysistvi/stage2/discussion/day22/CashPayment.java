package com.joysistvi.stage2.discussion.day22;

import com.joysistvi.stage2.discussion.day22.Payment;

public class CashPayment extends Payment implements Refundable {
    double amount;

    public CashPayment(double balance) {
        super(balance);

    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount +"Using Cash Payment");
    }

    @Override
    public void refund(double amount) {

    }
}
