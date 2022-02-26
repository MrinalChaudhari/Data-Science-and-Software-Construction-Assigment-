package activities;


import java.util.Scanner;

public class Calculator {

    public static void arithmetic(float x, float y)
    {

        System.out.println("X+Y=" +(x+y));
        System.out.println("X-Y=" +(x-y));
        System.out.println("X*Y=" +(x*y));
        System.out.println("X/Y=" +(x/y));


    }

    public static void main(String arg[])
    {
        float x, y;

        System.out.println("Enter two number:" );
        Scanner input= new Scanner(System.in);
        x= input.nextFloat();
        y=input.nextFloat();
        arithmetic(x,y);
        arithmetic(x,y);
        arithmetic(x,y);

    }
}
