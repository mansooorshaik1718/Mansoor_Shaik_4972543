package Exercise5;

public class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending Email with message: "+message);
    }
       
}
