package session.Activity4;

import java.util.Scanner;

public class CountUp {

    public static void main(String args[])
    {

        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number:");
        n= input.nextInt();
        for(n=0;n<=10;n++)
        {
            System.out.println("Number" +n);
        }
    }


}
