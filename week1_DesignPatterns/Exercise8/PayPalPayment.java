package Exercise8;

public class PayPalPayment implements PaymentStrategy{
    private String emailId;
    private String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal.");
        System.out.println("PayPal Details: ");
        System.out.println("Email ID: " + emailId);
        System.out.println("Password: " + password);
    }
}
