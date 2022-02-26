/**
 * Write a method that uses recursion to raise a number to a power. The method should accept two arguments: the number to be raised and the exponent.
 */
Package Homework05;

import java.util.Scanner;

public class Power
{
    public static void main(String args[])
    {
            int base,power,result;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter base value:");
            base=input.nextInt();
            System.out.println("Enter power value");
            power=input.nextInt();
            result= PowerN(base,power);
            System.out.println("Exponential value of base " +base+ " to power " +power+ " is " +result);
    }//end of main class

    /**
     *
     * @param in first condition, if power is not equal to zero then it
     *         return multiplication of base and recursive function of (power-1);
     * @return else it returns value one
     */
    public static int PowerN(int base,int power)
    {
        if(power!=0)
        {
            return (base*PowerN(base,power-1));
        }
        else
        {
            return 1;

        }
    }

}//Power class ends
