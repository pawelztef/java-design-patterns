public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing Circle");
  }
  @Override
  public void resize() {
    System.out.println("Resizing Circle");
  }
  @Override
  public String describe() {
    return "Circle object";
  }
  @Override
  public boolean isHidden() {
    return false;
  }
}