package Exercise8;

public class TestPaymentStrategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying wit Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890752263", "Will Jacks", "123", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(100.0);

        // Paying with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("jacks.will@rcb.com", "password123");
        context.setPaymentStrategy(payPalPayment);
        context.pay(200.0);
    }
}
