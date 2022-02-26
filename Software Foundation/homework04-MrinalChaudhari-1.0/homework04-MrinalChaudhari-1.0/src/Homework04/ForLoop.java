/**
 * Write a for loop that displays the following set of numbers: 0, 10, 20, 30, 40, 50 . . . 1000
 */


package Homework04;

/**
 * @forLoop intialize,condition and increment the value
 *
 */

public class ForLoop {

    public static void main(String args[])              //main class
    {
        int i;
        for( i=0;i<=1000;i=i+10)
        {
            System.out.print( +i + ",");
        }
    }                                                   //end of main class

}                                                       //end of class
