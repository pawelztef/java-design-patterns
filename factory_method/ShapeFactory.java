public class ShapeFactory {
  public Shape getShape(String shapeName) {
    Shape shape = null;
    if(shapeName != null) {
     if(shapeName == "CIRCLE") {
       shape = new Circle();
     } else if (shapeName == "SQUARE") {
       shape = new Square();
     } else if (shapeName == "TRIANGLE") {
       shape = new Triangle();
     } else {
       System.out.println("Shape not recognized.");
     }
    } else {
      System.out.println("Shape not specified.");
    }
    return shape;
  }
}