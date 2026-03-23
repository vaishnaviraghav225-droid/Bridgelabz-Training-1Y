package com.Six;

public class Runner {
    public static void main(String[] args) {

        Worker w1 = new Chef("Arjun", 101, "Italian Cuisine");
        Worker w2 = new Waiter("Rohit", 102, 5);

        w1.performDuties();
        w2.performDuties();
    }
}