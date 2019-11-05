public class Singleton2 {
  // Lazy instatiation.
  private static Singleton2 SINGLE_INSTANCE = null;
  public static Singleton2 getInstance() {
    if(SINGLE_INSTANCE == null) {
      synchronized(Singleton2.class) {
      return SINGLE_INSTANCE = new Singleton2();
      }
    } 
    return SINGLE_INSTANCE;
  }
}