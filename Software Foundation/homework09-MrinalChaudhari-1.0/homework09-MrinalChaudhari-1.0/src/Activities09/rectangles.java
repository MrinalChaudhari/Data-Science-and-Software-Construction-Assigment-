package Activities09;

import java.awt.geom.Area;
import java.util.Objects;

public class rectangles extends Shape {
    private int width;
    private int height;

    public rectangles() {
        super();
        width=0;
        height=0;
    }
    public rectangles(int width,int height){
        this.width=width;
        this.height=height;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void Area(){
        setArea(width*height);
        System.out.println(getArea());
    }
    public void Perimeter(){
        setPerimeter(2*(width*height));
        System.out.println(getPerimeter());
    }

}
