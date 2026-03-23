package com.Six;

class WalletProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Wallet refund of ₹" + amount + " processed instantly.");
    }
}