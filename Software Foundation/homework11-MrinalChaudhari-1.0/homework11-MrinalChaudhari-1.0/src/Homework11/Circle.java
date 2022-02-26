package Homework11;

/**
 * A circle shape.
 */
public class Circle extends Shape {
    /**
     * The radius of the circle.
     */
    private double radius;

    /**
     * Creates a new circle.
     *
     * @param pos The position of the top left corner.
     * @param fillColor The fill color.
     * @param lineColor The outline color.
     * @param radius The radius of the circle.
     */
    public Circle(Position pos, String fillColor, String lineColor,
                  double radius) {
        super(pos, fillColor, lineColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newradius) throws Exceptionclass {
        if(radius>=0)
        this.radius = newradius;
        else
            throw new IllegalArgumentException(
                    "Radius cannot be negative");
    }

    /**
     * Computes and returns the area of the circle.
     *
     * @return Returns the area of the circle.
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Computes and returns the perimeter of the circle.
     *
     * @return Returns the perimeter of the circle.
     */
    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public void scale(double scale) {
        radius=radius*scale;
    }
}
