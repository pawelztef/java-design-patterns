public class LineTicknessDecorator extends ShapeDecorator {
  protected double thickness;
  LineTicknessDecorator(Shape decoratedShape, double thickness) { 
    super(decoratedShape);
    this.thickness = thickness;
  }
  
  @Override
  public void draw() {
    decoratedShape.draw();
    System.out.println("Line thickness: " + thickness);
  }
  
  @Override
  public void resize() {
    decoratedShape.draw();
  }
  
  @Override
  public String describe() {
    return decoratedShape.describe() + " drawn with line thickness " + thickness + ".";
  }
  
  @Override 
  public boolean isHidden() {
    return decoratedShape.isHidden();
  }
}