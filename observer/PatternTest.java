public class PatternTest {
  public static void main(String... args) {
    StockGrabber stockGrabber = new StockGrabber();
    StockObserver stockObserver1 = new StockObserver(stockGrabber);
    StockObserver stockObserver2 = new StockObserver(stockGrabber);
    stockGrabber.setImbPrice(197.600);
    stockGrabber.setAppPrice(302.600);
    stockGrabber.setGooPrice(223.700);
  }
}