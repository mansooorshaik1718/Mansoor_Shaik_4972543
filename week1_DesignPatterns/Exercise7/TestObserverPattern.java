package Exercise7;

public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.register(mobileApp1);
        stockMarket.register(webApp1);

        stockMarket.setStockPrice(100.00);
        System.out.println();

        stockMarket.setStockPrice(105.50);
        System.out.println();

        stockMarket.deregister(mobileApp1);
        stockMarket.setStockPrice(110.75);
    }
}
