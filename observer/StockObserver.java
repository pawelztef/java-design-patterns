public class StockObserver implements Observer {
  
  private static int observerIDTracker = 0;
  private int observerID;
  private Subject stockGrabber;
  private double ibmPrice, appPrice, gooPrice;
  
  public StockObserver(Subject stockGrabber) {
   this.observerID = ++observerIDTracker;
   this.stockGrabber = stockGrabber;
   System.out.println("New Observer " + this.observerID);
   this.stockGrabber.register(this);
  }
  
  public void update(double ibmPrice, double appPrice, double gooPrice) {
    this.ibmPrice = ibmPrice;
    this.appPrice = appPrice;
    this.gooPrice = gooPrice;
    printPrices();
  }
  
  public void printPrices() {
    System.out.println("Observer " + this.observerID + "\nIBM: " +
                      this.ibmPrice + "\nAPPLE: " + this.appPrice + "\nGOOGLE: " + this.gooPrice);
  }
}