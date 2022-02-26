
/*
Write a recursive function that accepts two arguments into the parameters x and y. The function should return the value of x times y.
 */
Package Homework05;

import java.util.Scanner;

public class Multiply
{
    /**
     *
     * @param args
     * user enters two number which is then sent to the method for further functions
     */
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter first Number:");
        num1=input.nextInt();
        System.out.println("Enter first Number:");
        num2=input.nextInt();
        result=multiply(num1,num2);
        System.out.println("Multiplication of " +num1+ " and " +num2 + " is " +result);

    }//end of main class

    /**
     *
     * @param First condition checks if both number are zero then method return value 0;
     * @param if num1 is 1 then return num2
     * @return otherwise return addition of two number using recursion
     */
    public static int multiply(int num1,int num2)
    {
        if(num1==0 || num2==0)
        {
            return 0;
        }
        if(num1==1)
        {
            return num2;
        }
        else
        {
            return multiply(num1-1,num2)+num2;
        }
    }
    
}//end of multiply class
