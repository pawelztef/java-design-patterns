public class Test {
  public static void main(String... args) {
    
  // Fluent interface pattern
    BankAccount account1 = new BankAccount.Builder(123L)
      .withOwner("Pawel")
      .atBranch("O'Connell")
      .openingBalance(222.2)
      .atRate(1.1)
      .build();
    System.out.println(account1);
  }
}