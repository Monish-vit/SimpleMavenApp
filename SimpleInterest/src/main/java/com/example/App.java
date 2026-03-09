package com.example;

public class App {
    public static void main(String[] args) {
        double principal = 5000;
        double rate = 7.5;
        double time = 3;

        double interest = calculateInterest(principal, rate, time);

        System.out.println("--- Simple Interest Calculator ---");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Calculated Interest: " + interest);
    }

    public static double calculateInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
