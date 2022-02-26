package Homework10;

//figure interface
public interface Figure {
    public abstract Position getPos();
    void move(Position pos);
    public abstract String getFillColor();
    public abstract String getLineColor();
    double area();
    double perimeter();
    void scale(double scale);


}
