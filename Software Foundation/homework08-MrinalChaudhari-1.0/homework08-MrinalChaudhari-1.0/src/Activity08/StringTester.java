package Activity08;

import java.util.Scanner;

public class StringTester {

    public static void main(String[] args){

        String x="Mrinal";
        String y="Mrinal";
        String z="ABC";

        System.out.println("X=y" +x==y);
        System.out.println("x=z" +x==z);
       String xs= new String("Buttercup");
       String ys=new String("Buttercup");
       System.out.println("Xs=Ys" +xs==ys);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first String ");
        String a= input.nextLine();
        System.out.println("Enter Second String ");
        String b= input.nextLine();
        System.out.println("Two strings comparison " +(a==b));

    }
}
