public class Test {
  public static void main(String... args) {
    AbstractFactory twoD = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY); 
    AbstractFactory threeD = FactoryProvider.getFactory(FactoryType.THREE_D_SHAPE_FACTORY);
    GeometricShape line, sphere;
    line = twoD.getShape(ShapeType.LINE);
    sphere = threeD.getShape(ShapeType.SPHERE);
    line.draw();
    sphere.draw();
  }
}