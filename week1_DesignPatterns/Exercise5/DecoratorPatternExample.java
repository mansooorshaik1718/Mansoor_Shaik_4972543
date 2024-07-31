package Exercise5;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the EmailNotifier with SMSNotifierDecorator
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier); 

        // Decorate the SMS and Email Notifier with SlackNotifierDecorator
        Notifier slackSMSEmailNotifier = new SlackNotifierDecorator(smsEmailNotifier);


        // Sending notifications
        System.out.println("Sending with EmailNotifier:");
        emailNotifier.send("Hello, this is a basic email notification!");

        System.out.println("\nSending with SMSNotifierDecorator wrapped around EmailNotifier:");
        smsEmailNotifier.send("Hello, this is an email and SMS notification!");

        System.out.println("\nSending with SlackNotifierDecorator wrapped around SMS and Email Notifier:");
        slackSMSEmailNotifier.send("Hello, this is an email, SMS, and Slack notification!");
    }
}
