/*
Write a method that accepts an integer argument and returns the sum of all the integers from 1 up to the number passed as an argument.
 */

Package Homework05;

import java.util.Scanner;

public class Sum {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,result;
        System.out.println("Enter the number for addition of all number till that number:");
        n=input.nextInt();
        result=sum(n);
        System.out.println("Addition of all number from 0 to " +n+ " is " +result);

    }//end of main class
    /**
     * n if number is less than zero then return zero
     * otherwise perform the recursive case , where number plus the result of addition up to n-1;
    */
    public static int sum(int n)
    {
        if (n<=0)
        {
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }
    }

}//Sum class ends
