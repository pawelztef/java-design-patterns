public class FactoryProvider {
  public static AbstractFactory getFactory(FactoryType name) {
    if(FactoryType.TWO_D_SHAPE_FACTORY == name) {
      return new TwoDShapeFactory();
    } else if (FactoryType.THREE_D_SHAPE_FACTORY == name) {
      return new ThreeDShapeFactory();
    }
    return null;
  } 
}