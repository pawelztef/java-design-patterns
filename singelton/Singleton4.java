public class Singleton4 {
  // Inner Class lazy instatiation example.
  public static class SingletonHolder {
    static final Singleton4 SINGLE_INSTANCE = new Singleton4();
  }
  public static Singleton4 getInstance() {
    return SingletonHolder.SINGLE_INSTANCE;
  }
}