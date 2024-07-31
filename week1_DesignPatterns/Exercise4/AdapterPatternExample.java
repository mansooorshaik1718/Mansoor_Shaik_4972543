package Exercise4;

public class AdapterPatternExample {
    public static void main(String[] args) {
    // Create instances of payment gateways
    PayPalGateway payPalGateway = new PayPalGateway();
    StripeGateway stripeGateway = new StripeGateway(); 
      
    // Create adapter instances
    PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
    PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

    // Process payments through different adapters
    System.out.println("Testing PayPal Adapter:");
    payPalAdapter.processPayment(100.00);

    System.out.println("\nTesting Stripe Adapter:");
    stripeAdapter.processPayment(200.00);
    }
}
