package activities;

import java.util.Scanner;

public class WeightConverter {

    public static void main(String args[])
    {
        float P;
        Scanner input=new Scanner(System.in);

        System.out.println("Enter weight in pound:");
         P= input.nextFloat();
        Weight(P);
        Weight(P);
    }

    public static void Weight(float P)
    {
        System.out.println("Weight in kilos is" +(P*0.453592));

    }
}
