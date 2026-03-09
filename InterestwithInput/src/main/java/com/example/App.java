package com.example;

public class App {
    public static void main(String[] args) {
        // This reads the parameters passed from Jenkins
        double principal = (args.length > 0) ? Double.parseDouble(args[0]) : 1000;
        double rate = (args.length > 1) ? Double.parseDouble(args[1]) : 5;
        double time = (args.length > 2) ? Double.parseDouble(args[2]) : 1;

        double interest = (principal * rate * time) / 100;

        System.out.println("--- Simple Interest Results ---");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Calculated Interest: " + interest);
    }
}
