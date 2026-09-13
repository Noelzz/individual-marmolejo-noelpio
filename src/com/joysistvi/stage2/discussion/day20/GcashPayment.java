package com.joysistvi.stage2.discussion.day20;

public class GcashPayment extends Payment {
    double savings;

    public GcashPayment(double balance) {
        super(balance);

    }
    void pay(double balance) {
        System.out.println("Paid "+ amount +"Using GCash Payment");
    }


}

