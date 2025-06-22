package singletonPattern;

public class Logger {
    // Step 1: Create a private static instance of Logger
    private static Logger instance;

    // Step 2: Make the constructor private so it cannot be instantiated from outside
    private Logger() {
        System.out.println("Logger instance created.");
    }


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }


    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}