package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calculator calculator = new Calculator();
        int res = calculator.subtraction(6,10);
        System.out.println("the result is " + res);
    }
}