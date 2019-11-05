import java.util.List;
import java.util.ArrayList;

public class Test {
  public static void main(String... args) {
    List<Shape> shapes = new ArrayList<Shape>();
    List<Shape> shapesCopy = new ArrayList<Shape>();
    
    Circle circle = new Circle();
    circle.x = 10;
    circle.y = 20;
    circle.radius = 5;
    circle.colour = "red";
    shapes.add(circle);
    Circle anotherCircle = (Circle) circle.clone();
    shapes.add(anotherCircle);
    
    Rectangle rectangle = new Rectangle();
    rectangle.x = 30;
    rectangle.y = 40;
    rectangle.colour = "blue";
    shapes.add(rectangle); 
    cloneAndCompare(shapes, shapesCopy);
  }
  
  
  private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
    for(Shape sh : shapes) {
      shapesCopy.add(sh.clone());
    }
    for (int i = 0; i<shapes.size(); i++) {
      if (shapes.get(i) != shapesCopy.get(i)) {
        System.out.println("list no. " + i + ", Shapes objects are different objects,");
      	if ( shapes.get(i).equals(shapesCopy.get(i)) ) {
          System.out.println("but they are identical!");
        } else {
          System.out.println("and they aren't identical!");
        }
      } else {
        System.out.println("list no. " + i + ", Shapes objects are the same!");
      }
    }
  }
}