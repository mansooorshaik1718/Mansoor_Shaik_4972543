package Exercise6;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded from disk
        image.display();
        System.out.println("");

        // Image will not be loaded from disk, it will be cached
        image.display();
    }
}
