package homework;   // Given package name.

import java.util.Scanner;   //this utility read input from keyboard

public class Kelvin{        //start of kelvin class

        public static void main(String arg[])       // start of main class class
        {
            double F;
            Scanner input = new Scanner(System.in); //System.in is used to read input type from user

            System.out.println("Please enter Fahrenheit temperature");
            F= input.nextDouble();                   //reading next word and return floating value

            System.out.println( F+  " degree Fahrenheit is " +degreeKelvin(F)+ " degree kelvin");

        }   //end of main class

      public static double degreeKelvin(double F) // degreeKelvin function starts with floating parameter F
        {
            return  (5.0/9.0 * (F - 32) + 273.15);  // Returns value in degree kelvin
                                                //formula is K=5/9*(F-32)+273
        }   // function ends

    }   // kelvin class ends

