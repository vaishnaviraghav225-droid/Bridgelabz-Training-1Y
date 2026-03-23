
package com.Three;

class Wallet implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Wallet.");
    }
}
