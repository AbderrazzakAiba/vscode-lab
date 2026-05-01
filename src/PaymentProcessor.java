// Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Concrete Strategy 1
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Concrete Strategy 2
class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Concrete Strategy 3
class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

// Context Class
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}