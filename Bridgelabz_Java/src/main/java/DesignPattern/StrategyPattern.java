
/*
Program 21: Strategy Design Pattern

Purpose:
Strategy Pattern defines multiple algorithms and makes them
interchangeable at runtime.
Here, different payment methods use the same interface.
*/

// Strategy interface defines the common payment operation
interface PaymentStrategy {
    void pay(double amount);
}

// First strategy: Pay using a credit card
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

// Second strategy: Pay using UPI
class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

// Context uses the selected payment strategy
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        // Select or change the payment method at runtime
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method");
            return;
        }

        // Execute the selected payment algorithm
        paymentStrategy.pay(amount);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        // Create the shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Select credit card payment
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(1000);

        // Change the strategy to UPI payment
        cart.setPaymentStrategy(new UpiPayment());
        cart.checkout(500);
    }
}
