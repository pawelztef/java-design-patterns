abstract class Shape {
  
  public int x, y;
  public String colour;
  
  public Shape() {}
  
  public Shape(Shape target) {
    if(target != null) {
      this.x = target.x;
      this.y = target.y;
      this.colour = target.colour;
    }
  }
  
  public abstract Shape clone();
  
  @Override
  public boolean equals(Object obj2) {
    if(!(obj2 instanceof Shape)) return false;
		Shape shape = (Shape)obj2;
    return shape.x == this.x && shape.y == this.y && shape.colour.equals(this.colour);
  }
  
}