
/*
Pattern 1: Singleton Design Pattern
Purpose: Create only one object of Logger.
*/

class Logger {
    // Single instance of Logger
    private static final Logger instance = new Logger();

    // Private constructor prevents external object creation
    private Logger() {
    }

    // Returns the same instance every time
    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class Singleton{
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started");

        // Both references point to the same object
        System.out.println("Same instance: " + (logger1 == logger2));
    }
}
