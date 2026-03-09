package com.example;

public class App {
    public static void main(String[] args) {
        // Default to 5 if no argument is provided
        int number = (args.length > 0) ? Integer.parseInt(args[0]) : 5;
        
        System.out.println("Multiplication Table for: " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, (number * i));
        }
    }
}
