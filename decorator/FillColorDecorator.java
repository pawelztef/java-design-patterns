public class FillColorDecorator extends ShapeDecorator {
  protected Color color;
  
  public FillColorDecorator(Shape decoratedShape, Color color) {
    super(decoratedShape);
    this.color = color;
  }
  
  @Override
  public void draw() {
    decoratedShape.draw();
    System.out.println("Fill with color: " + color);
  }
  
  @Override
  public void resize() {
    decoratedShape.resize();
  } 
  
  @Override
  public String describe() {
    return decoratedShape.describe() + " Filled with color " + color + " color.";
  }
  
  @Override
  public boolean isHidden() {
    return decoratedShape.isHidden();
  }
}