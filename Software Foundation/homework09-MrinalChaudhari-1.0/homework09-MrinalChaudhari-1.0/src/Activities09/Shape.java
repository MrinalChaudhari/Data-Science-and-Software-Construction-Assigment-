package Activities09;

public class Shape {
    private String Fillcolor;
    private String Linecolor;
    private double Area=0;
    private double Perimeter=0;

    public Shape() {
        this.Fillcolor ="";
        this.Linecolor = "";
        this.Area = 0.0;
        this.Perimeter = 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Fillcolor='" + Fillcolor + '\'' +
                ", Linecolor='" + Linecolor + '\'' +
                ", Area=" + Area +
                ", Perimeter=" + Perimeter +
                '}';
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }

    public String getFillcolor() {
        return Fillcolor;
    }

    public void setFillcolor(String fillcolor) {
        Fillcolor = fillcolor;
    }

    public String getLinecolor() {
        return Linecolor;
    }

    public void setLinecolor(String linecolor) {
        Linecolor = linecolor;
    }

    public static void main(String[] args){
        rectangles r=new rectangles(3,4);
        circles c =new circles(3);
        r.Area();
        r.Perimeter();
        c.Area();
        c.Perimeter();
    }

}
