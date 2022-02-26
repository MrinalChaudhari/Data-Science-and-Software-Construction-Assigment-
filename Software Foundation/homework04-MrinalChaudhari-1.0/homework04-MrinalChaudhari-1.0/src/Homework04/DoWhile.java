/**
 * Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
 */

package Homework04;

import java.util.Scanner;

/**
 * In do while loop statement will be printed once without checking condition
 * user give two input and condition prompts if user wants to continue again
 * here ch is condition where user has to choose between "Y"/"N":
 * according to condition loop runs next time
 */

public class DoWhile {                      //class starts

    public static void main(String args[])          //main class
    {
        double N1,N2,Sum;
        char ch;
        Scanner input= new Scanner(System.in);
        do
            {
                System.out.println("Enter first number:");
                N1= input.nextDouble();                     //read input first time
                System.out.println("Enter second number:");
                N2= input.nextDouble();                     //read input second time
                Sum=N1+N2;                                  //addition of two number
                System.out.println("Sum of two numbers is:" +Sum);
                System.out.println("Do you want to repeat again??");
                System.out.println("Please press Y/N:");
                ch= input.next().charAt(0);
            }while (ch=='Y' || ch=='N');
    }           //end of main class
    /**
     * @charAt() returns the character at the specified index in a string.
     * @while(ch=='Y' || ch=='N') checking condition if user enters value Y or N;
     */

}
//end of class
