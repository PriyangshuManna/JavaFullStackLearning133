package org.example;

public class Logger {

    //a private static instance of the class
    private static Logger instance;

    // the constructor
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

