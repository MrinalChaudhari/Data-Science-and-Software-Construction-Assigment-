package activities.sessions;

import java.util.Scanner;

public class Divisible5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num % 5 == 0) {
            System.out.println(num + " divisible by 5");
        }
        else
            System.out.println(num + " not divisible by 5");
    }
}