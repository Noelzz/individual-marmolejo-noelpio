package com.joysistvi.stage2.discussion.day22;

public class Main {
    public static void main(String[] args) {
        CashPayment cash = new CashPayment(5000);
        GcashPayment gcash = new GcashPayment(5000);
        CreditCardPayment credit = new CreditCardPayment(500500);

        //gcash.pay(1500);
       // cash.pay(2500);
       // credit.pay(1500);

        cash.printReceipt(2000);
        gcash.printReceipt(2000);
        credit.printReceipt(2000);
    }
}
