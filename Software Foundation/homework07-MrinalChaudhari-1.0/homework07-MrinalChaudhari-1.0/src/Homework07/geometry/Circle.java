package Homework07.geometry;

import java.util.*;

public class Circle {

    private double CenterX=0;
    private double CenterY=0;
    private double radius=0;

    @Override
    public String toString() {
        return "Circle{" +
                "CenterX=" + CenterX +
                ", CenterY=" + CenterY +
                ", radius=" + radius +
                '}';
    }

    public double getCenterX() {
        return CenterX;
    }

    public void setCenterX(double centerX) {
        CenterX = centerX;
    }

    public double getCenterY() {
        return CenterY;
    }

    public void setCenterY(double centerY) {
        CenterY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //calculation for perimeter
    public double perimeter()
    {
        return 2*3.14*radius;
    }
    //calculation for area
    public double area()
    {
        return 3.14*radius*radius;
    }
    //this method checks if the point is lies inside or outside of circle
    public void testAppartenance(double x, double y) {
        if ((CenterX - x) * (CenterX - x) + (CenterY - y) * (CenterY - y) <= (radius * radius))
            System.out.println("Point lies inside the circle");
        else
            System.out.println("Point lies outside of the circle");

    }
    //displays result of area and perimeter
    public void Display()
    {
        System.out.println(area());
        System.out.println(perimeter());
    }

}
