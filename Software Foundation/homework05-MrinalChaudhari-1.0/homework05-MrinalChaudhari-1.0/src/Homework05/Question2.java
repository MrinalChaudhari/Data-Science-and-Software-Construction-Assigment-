Package Homework05;

import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = input.nextInt();
        sign(n);

    }

    public static void sign(int n) {

        if(n>0)
        {
            System.out.println("No Parking");
            sign(n-1);
        }
    }
}
