package homework;

import java.util.Scanner;       //this utility read input from keyboard
public class Concatenation {    //Concatenation class starts

    public static void main(String arg[])       //Main class starts
    {

        Scanner input = new Scanner(System.in);     //System.in is used to read input type from user
        System.out.print("Please enter your name: ");
        String str= input.nextLine();               //reads string

        System.out.print("Enter your ID: ");
        int a= input.nextInt();                     //reading next word and return int value

        System.out.println("Your email-id for university is:" +concat(str,a)+"@rit.edu");
    }   //main class ends


/** concat function starts with two different parameter i.e string and int value.
 * It returns String value
 * It returns : concat= string1+ interger value
 */

public static String concat(String str, int a)
    {

        return str+a;

    }

}   //end of Concatenation class
