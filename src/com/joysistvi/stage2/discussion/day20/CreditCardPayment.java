package com.joysistvi.stage2.discussion.day20;

public class CreditCardPayment extends Payment {
    public CreditCardPayment(double balance) {
        super(balance);

    }

    void pay(double balance) {
        System.out.println("Paid "+ amount +"Using CreditCard Payment");
    }

}
