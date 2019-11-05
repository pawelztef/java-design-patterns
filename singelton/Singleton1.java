public class Singleton1 {
  // Version with eager instatiation.
  private static final Singleton1 SINGLE_INSTANCE = new Singleton1();
  
  public static Singleton1 getInstance() {
    return SINGLE_INSTANCE;
  }
  
}