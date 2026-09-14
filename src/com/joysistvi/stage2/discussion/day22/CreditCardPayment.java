package com.joysistvi.stage2.discussion.day22;

import com.joysistvi.stage2.discussion.day22.Payment;

public class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(double balance) {
        super(balance);

    }

    public void pay(double amount) {
        System.out.println("Paid "+ amount +"Using CreditCard Payment");
    }

    @Override
    public void refund(double amount) {

    }
}
