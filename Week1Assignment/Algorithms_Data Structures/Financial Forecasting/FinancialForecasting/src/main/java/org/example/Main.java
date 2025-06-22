package org.example;

public class Main {
    public static void main(String[] args) {
        double currentValue = 10000;  // Starting amount
        double rate = 0.07;           // 7% annual growth
        int years = 5;

        double result = futureValue(currentValue, rate, years);
        System.out.printf("Future value after %d years: ₹%.2f%n", years, result);
    }
    public static double futureValue(double currentValue, double rate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return futureValue(currentValue, rate, years - 1) * (1 + rate);
    }
    public static double futureValueIterative(double currentValue, double rate, int years) {
        double result = currentValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + rate);
        }
        return result;
    }


}