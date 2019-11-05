public class FactoryTest {
  public static void main(String... args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle, triangle, square;
    circle = shapeFactory.getShape("CIRCLE");
    triangle = shapeFactory.getShape("TRIANGLE");
    square = shapeFactory.getShape("SQUARE");
    
    circle.draw();
    triangle.draw();
    square.draw();
  }
}