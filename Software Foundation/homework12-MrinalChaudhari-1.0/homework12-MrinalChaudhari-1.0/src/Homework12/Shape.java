package Homework12;

/**
 * The parent class for all shapes.
 */
public class Shape {
    /**
     * The position of the shape. The meaning of this is different depending
     * on the shape.
     */
    private Position pos;

    /**
     * The shape fill color.
     */
    private String fillColor;

    /**
     * The shape line color.
     */
    private String lineColor;
   private Object Circle;
    private Object Rectangle;
    private Object Triangle;

    /**
     * Creates a new shape.
     *
     * @param pos The initial position of the shape.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     */
    public Shape(Position pos, String fillColor, String lineColor) {
        this.pos = pos;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    public Position getPos() {
        return pos;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void move(Position pos) {
        this.pos = pos;
    }

    /**
     * Returns the area of the shape. This cannot be computed for all shapes,
     * and so this method must be overridden in a child class.
     *
     * @return The area of the shape. By default this is 0.
     */
    public double area() {
        return 0.0d;
    }

    /**
     * Returns the perimeter of the shape. This cannot be computed for all
     * shapes, and so this method must be overridden in a child class.
     *
     * @return The perimeter of all shapes.
     */
    public double perimeter() {
        return 0.0d;
    }
   Shape shape1 = new Shape(new Position(100, 100), "Red", "Blue");
   Shape shape2 = new Shape(new Position(90, 90), "Red", "Blue");

    Circle circle1 = new Circle(new Position(6, 10), "Transparent", "Black", 50);
    Circle circle2 = new Circle(new Position(4, 8), "Transparent", "Black", 80);

    Rectangle rectangle1 = new Rectangle(new Position(50, 50), "Brown", "Yellow", 90, 50);
    Rectangle rectangle2 = new Rectangle(new Position(50, 50), "Brown", "Yellow", 100, 50);

    Triangle triangle1 = new Triangle(new Position(30, 50), "Blue", "Orange", 125);
    Triangle triangle2 = new Triangle(new Position(30, 50), "Blue", "Orange", 125);

    //this method will check if object is overlap with each other or not
   public boolean overlaps(Shape shape1, Shape shape2){
       if(getClass()!= Circle && getClass()!=Rectangle && getClass()==Triangle) {
           if(triangle1.getSide()-triangle2.getSide()==0)
               return true;
       }
       if (getClass()!= Circle && getClass()==Rectangle && getClass()!=Triangle){
           if(rectangle1.getHeight()>rectangle2.getHeight() || rectangle2.getHeight()>rectangle1.getHeight()
           || rectangle1.getWidth()> rectangle2.getWidth() || rectangle2.getWidth()>rectangle1.getWidth())
               return false;
       }
       if (getClass()== Circle && getClass()!=Rectangle && getClass()!=Triangle){

           int dist=(circle1.getPos().getX()-circle2.getPos().getX())* (circle1.getPos().getY()-circle2.getPos().getY());
           double raddist= (circle1.getRadius()+circle2.getRadius())*(circle1.getRadius()+circle2.getRadius());
           if(dist==raddist)
               return  true;
           else if(dist>raddist)
               return true;
           else
               return false;
       }
        return false;
    }

}
