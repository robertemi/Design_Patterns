package Observer;

public class Client {

    public static void main(String[] args) {
        StockObserver obs = new StockObserver("IBM");
        StockObserver obs2 = new StockObserver("Apple");

        StockMonitorApp sub = new StockMonitorApp();
    }
}