package Exercise8;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expirationDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    public void pay(double amount) {
        System.out.println(amount + " paid with credit card.");
        System.out.println("Card Details: ");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("CVV: " + cvv);
        System.out.println("Expiration Date: " + expirationDate);
    }
    
}
