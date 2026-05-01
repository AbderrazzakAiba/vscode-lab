public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        // Credit Card
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.processPayment(100);

        // PayPal
        processor.setPaymentStrategy(new PayPalPayment());
        processor.processPayment(50);

        // Bitcoin
        processor.setPaymentStrategy(new BitcoinPayment());
        processor.processPayment(200);
    }
}