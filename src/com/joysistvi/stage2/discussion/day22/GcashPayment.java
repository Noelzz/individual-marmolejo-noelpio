package com.joysistvi.stage2.discussion.day22;

import com.joysistvi.stage2.discussion.day22.Payment;

public class GcashPayment extends Payment implements Refundable {
    double savings;

    public GcashPayment(double balance) {
        super(balance);

    }

   public void pay(double amount) {

        System.out.println("Paid "+ amount +"Using GCash Payment");
    }

    public String getPayment(){
        return "GCash Payment";
    }


    @Override
    public void refund(double amount) {
        System.out.println("Refunding "+ amount +"Using GCash Payment");
    }
}

