package homework;

import java.util.*;

/**
 * If user enters negative values then that is not valid age.
 * N>0 and N!=0 would eliminate value of negative age from each conditions
 */

public class Age {          //Age class

    public static void main(String args[])
    {
        int N=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age in number:");
        N=input.nextInt();                  //reads input from user

        if(N>0 && N!=0 && N<=10)
        {
            System.out.println("Is this your first program?");
        }
        else if(N>0 && N!=0 &&  N<=13)
        {
            System.out.println("A tween!");
        }
        else if(N>0 && N!=0 &&  N<=20)
        {
            System.out.println("A teen!");
        }
        else if(N>0 && N!=0 &&  N<=30)
        {
            System.out.println("A twenty-something!");
        }
        else if(N>0 && N!=0 &&  N>=30)
        {
            System.out.println("With age comes experience.");
        }
        else
        {
            System.out.println("Please enter correct age");
        }

    }
}
//End of age class
