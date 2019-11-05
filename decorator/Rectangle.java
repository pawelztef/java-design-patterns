public class Rectangle implements Shape {
  public void draw() {
    System.out.println("Drawing Rectangle");
  }
  @Override
  public void resize() {
    System.out.println("Resizing Rectangle");
  }
  @Override
  public String describe() {
    return "Rectangle object";
  }
  @Override
  public boolean isHidden() {
    return false;
  }
}