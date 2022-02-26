package homework;


import java.util.Scanner;   //this utility read input from keyboard

public class Energy {       //Energy class starts

    public static void main(String arg[])       // Main class starts
    {
        double m;

        Scanner input = new Scanner(System.in); //System.in is used to read input type from user

        System.out.println("Please enter mass value in grams");
        m= input.nextDouble();                  //reading next word and return double value
        System.out.println( "Equivalent Energy in Joule is:" +Joule(m));


    }       //end of main class

    /**Joule function starts with double parameter m
     * declaring constant value C which is speed of light in vaccum m/s
     * return value of energy in joule
     * Formula: E=mc^2
     */

   public static double Joule(double m)
    {
        final int c = 299792458;
        return m*c*c;

    }        //Function ends

} // end of Energy class
