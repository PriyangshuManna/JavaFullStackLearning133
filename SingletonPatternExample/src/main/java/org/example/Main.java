package org.example;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("logging1...");
        logger2.log("logging2...");

        // Checking if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances created!");
        }
    }
}