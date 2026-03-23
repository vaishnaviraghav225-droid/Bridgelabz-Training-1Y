package com.Six;

public class Runner {
    public static void main(String[] args) {

        PaymentProcessor p1 = new UPIProcessor();
        PaymentProcessor p2 = new CreditCardProcessor();
        PaymentProcessor p3 = new WalletProcessor();

        p1.pay(500);
        p1.refund(200);   // uses default method

        p2.pay(1000);
        p2.refund(300);   // uses default method

        p3.pay(700);
        p3.refund(400);   // uses overridden method
    }
}