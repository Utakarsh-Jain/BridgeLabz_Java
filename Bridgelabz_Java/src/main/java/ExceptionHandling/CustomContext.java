/*
Problem Statement 5: Rethrowing Exceptions with Custom Context
Problem:
You have a method that processes user transactions. The method needs to catch and rethrow a
custom exception with additional context about the transaction.

*/

package main.java.ExceptionHandling;

public class CustomContext {
    
    static class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

static class TransactionProcessor {

    private double balance;

    public TransactionProcessor(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount, String userId)
            throws InsufficientFundsException {

        if (amount > balance) {

            // ------------------------
            // Add context before throwing
            // ------------------------
            String errorMessage = String.format(
                "Withdrawal failed for user %s: Amount %.2f exceeds balance %.2f",
                userId,
                amount,
                balance
            );

            throw new InsufficientFundsException(errorMessage);
        }

        balance -= amount;
        System.out.println("Withdrawal successful for user " + userId);
    }
}

public static void main(String[] args) {
    TransactionProcessor processor =
            new TransactionProcessor(1000.0);

    try {
        processor.withdraw(1500.0, "Alice"); //this will throw exception

    } catch (InsufficientFundsException e) {
        System.out.println("Transaction Error: " + e.getMessage());
    }
}
}
