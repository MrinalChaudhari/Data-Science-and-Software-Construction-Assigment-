package session.Activity4;

import java.util.Scanner;

public class CountDown {

    public static void main(String args[])
    {
        int n;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        n=input.nextInt();

        while( n > 0 )
        {
            n--;
            System.out.println("n = " + n );
        }
    }
}
