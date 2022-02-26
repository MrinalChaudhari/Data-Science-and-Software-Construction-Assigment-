/*
Write a Boolean method that uses recursion to determine whether a String argument is a palindrome. The method should return true if the argument reads the same forward and backward.
 */

Package Homework05;

import java.util.Scanner;

public class Pallindrome {
    /**
 *
 * @param Args
 * @Scanner takes input from user
 * Main class return string if it is pallindrome or not
 */

    public static void main(String Args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string to check whether it is pallindrome or not:");
        String string=input.nextLine();
        if(ispallindrome(string))
        {
            System.out.println(string+ " string is pallindrome");
        }
        else
        {
            System.out.println(string+ " string is not a pallindrome");
        }
    } //end of main class
    /**
     *
     * @param str
     * @return value in boolean if string is pallindrom
     * in first condition checks if string has one or zero character; then it will return true
     * @charAt checks first and last character of string if it is same then it will check same method for further substring
     * and process will continue till the condition and string completes
     * @ispallimdrome is a recursive function which is calling itself to check for character in substring
     * In else condition it will return false if none the above condition matches; it means string is not pallindrome.
     */
    public static boolean ispallindrome(String str)
    {
        if(str.length()==0 || str.length()==1)
        {
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1))
        {
            return ispallindrome(str.substring(1,str.length()-1));
        }
        else
        {
            return false;
        }
    }

}//end of Pallindrome class
