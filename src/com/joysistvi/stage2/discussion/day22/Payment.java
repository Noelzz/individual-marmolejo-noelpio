package com.joysistvi.stage2.discussion.day22;

public abstract class Payment {

    double balance;
    double amount;

    public Payment(double balance) {

        this.balance = balance;
    }


   public abstract void pay(double amount);

   public String getPayment(){
       return "Generic Payment";
   }

   public void printReceipt(double amount){
       pay(amount);
       System.out.println("Receipt "+ amount +"Using CreditCard Payment");
       System.out.println("-----------------------------");
   }

}
