class Test {
  public static void main(String... args) {
    
    System.out.println("Creating simple Shape Objects.");
    Shape rectangle = new Rectangle();
    Shape circle = new Circle();
    System.out.println("Drawing simple Shape Objects.");
    rectangle.draw();
    circle.draw();
    System.out.println();
    System.out.println("Creating Decorated Circle with color Red, blue lines in dash pattern."); 
    Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(new LineTicknessDecorator(new Circle(), 2.0d), LineStyle.DASH), Color.BLUE), Color.RED);
    // order of decorator is also not much important here since all are unique functionalities.
    // we can also do this nesting of functionalities in separate statements.
    System.out.println("Creating object with similar functionalities in separte statements");
    Circle c = new Circle();
    LineTicknessDecorator lt = new LineTicknessDecorator(c, 2.0d);
    LineStyleDecorator ld = new LineStyleDecorator(lt, LineStyle.DASH);
    LineColorDecorator lc = new LineColorDecorator(ld, Color.BLUE);
    FillColorDecorator fc = new FillColorDecorator(lc, Color.RED);
    Shape circle3 = fc;
    circle3.draw();
    System.out.println();
    
  }
}
