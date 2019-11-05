public class Singleton3 {
  // Double lock lazy instatiation example.
  private static Singleton3 SINGLE_INSTANCE = null;
  
  public static Singleton3 getInstance() {
    if(SINGLE_INSTANCE == null) {
      synchronized(Singleton3.class) {
        if(SINGLE_INSTANCE == null) {
          return SINGLE_INSTANCE = new Singleton3();
        } 
          return SINGLE_INSTANCE; 
      }
    }
          return SINGLE_INSTANCE; 
  }
}