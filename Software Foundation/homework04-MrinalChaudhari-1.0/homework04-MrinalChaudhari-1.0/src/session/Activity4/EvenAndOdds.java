package session.Activity4;

import java.util.Scanner;
public class EvenAndOdds {

    public static void main(String args[])
    {
        int n=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number:");
        n= input.nextInt();
        do
        {

            if(n%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
            n=n-1;
        }while(n!=0);


    }

}
