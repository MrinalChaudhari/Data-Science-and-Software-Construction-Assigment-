/*The aim of this program is to calculate area and perimeter of circle and checking if the point is inside a circle or not. */

package Homework07.geometry;

import java.util.*;


public class TestCircle{
    /**
     *
     * @param args main method takes all input from user
     *  Scanner reads input from user
     *  c and p object created for Circle and Point classes to test the result.
     *  user input passes to particular classes for further implementation.
     */

    public static void main (String [] args) //start of main method
    {
        Scanner input=new Scanner(System.in);
        double X,Y,radius,X_center,Y_center;
        System.out.println("Enter X (abscissa) :");
        X=input.nextDouble();
        System.out.println("Enter Y (Ordinate) :");
        Y=input.nextDouble();

        System.out.println("Enter X-coordinate of center of circle:");
        X_center=input.nextDouble();
        System.out.println("Enter Y-coordinate of center of circle:");
        Y_center=input.nextDouble();
        System.out.println("Enter radius of circle:");
        radius=input.nextDouble();

        Point p=new Point();
        p.setAbscissa(X);
        p.setOrdinate(Y);

        Circle c=new Circle();
        c.setCenterX(X_center);
        c.setCenterY(Y_center);
        c.setRadius(radius);
        c.testAppartenance(X,Y);
        c.Display();
    }//end of main class
}//end of Testcircle class



