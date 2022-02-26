package Activities09;

public class circles extends Shape {
    private int radius;

    public circles() {
        super();
        radius = 0;
    }

    public circles(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circles{" +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void Area() {
        setArea(3.14 * radius * radius);
    }

    public void Perimeter() {
        setPerimeter(2 * 3.14 * radius);
    }
}