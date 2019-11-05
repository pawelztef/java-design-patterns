import java.util.ArrayList;

public class StockGrabber implements Subject {
  
  private ArrayList<Observer> observers;
  private double ibmPrice, appPrice, gooPrice;

  public StockGrabber() {
    this.observers = new ArrayList<>();
  }

  public void register(Observer o) {
    observers.add(o);
  }
  
  public void unregister(Observer observer) {
     int index = observers.indexOf(observer); 
     System.out.println("Observer " + (index+1) + " removed");
     observers.remove(index);
  }
  
  public void notifyObserver() {
     for(Observer o : observers) {
       o.update(ibmPrice, appPrice, gooPrice);
     } 
  }
  
  public void setImbPrice(double imbPrice) {
    this.ibmPrice = imbPrice;
    notifyObserver();
  }
  public void setAppPrice(double appPrice) {
    this.appPrice = appPrice;
    notifyObserver();
  }
  public void setGooPrice(double gooPrice) {
    this.gooPrice = gooPrice;
    notifyObserver();
  }
}