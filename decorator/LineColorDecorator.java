public class LineColorDecorator extends ShapeDecorator {
  protected Color color;
  
  public LineColorDecorator(Shape decoratedShape, Color color) {
    super(decoratedShape);
    this.color = color;
  }
  
  @Override
  public void draw() {
    decoratedShape.draw();
    System.out.println("Line color " + color);
  }
  
  @Override
  public void resize() {
    decoratedShape.resize();
  }
  
  @Override
  public String describe() {
    return decoratedShape.describe() + " drawn with color " + color; 
  }
  
  @Override 
  public boolean isHidden() {
    return decoratedShape.isHidden();
  }
}