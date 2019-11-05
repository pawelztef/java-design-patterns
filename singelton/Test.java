public class Test {
  public static void main(String... args) {
    Singleton1 s1 = new Singleton1();
    Singleton2 s2 = new Singleton2();
    Singleton3 s3 = new Singleton3();
    Singleton4 s4 = new Singleton4();
    System.out.println("Singleton1 call1 " + s1.getInstance());
    System.out.println("Singleton1 call2 " + s1.getInstance());
    System.out.println("Singleton1 call3 " + s1.getInstance());
    System.out.println("");
    System.out.println("Singleton2 call1 " + s2.getInstance());
    System.out.println("Singleton2 call2 " + s2.getInstance());
    System.out.println("Singleton2 call3 " + s2.getInstance());
    System.out.println("");
    System.out.println("Singleton3 call1 " + s3.getInstance());
    System.out.println("Singleton3 call2 " + s3.getInstance());
    System.out.println("Singleton3 call3 " + s3.getInstance());
    System.out.println("");
    System.out.println("Singleton4 call1 " + s4.getInstance());
    System.out.println("Singleton4 call2 " + s4.getInstance());
    System.out.println("Singleton4 call3 " + s4.getInstance());
  }
}