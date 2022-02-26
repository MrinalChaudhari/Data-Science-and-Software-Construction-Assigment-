/*
Write a method that uses recursion to count the number of times a specific character occurs in an array of characters.
*/
Package Homework05;

import java.util.Scanner;

/**
 * User enters a string which is then converted to a array of character
 * array of character then sent to the method further.
 */
public class Character {


    public static void main(String args[])
    {
        int cnt=0,j=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str=input.nextLine();
        System.out.println("Enter a character:");
        char ch=input.next().charAt(0);
        char[] Array=new char[str.length()];
        for(int i=0;i<Array.length;i++)
        {
            Array[i]=str.charAt(i);
        }
        int size= Array.length;
        int result=Count(Array,ch,cnt,j);
        System.out.println(result);

    }//end of main class

    /**
     *
     * @param Array is character array is is being recursively called in the function
     * @param ch is a character that takes input from user(Basically this character need to be count in array list)
     * @param cnt is total number of frequency of character from array list
     * @param j variable
     * @return total number of count of character in array
     */
    public static int Count(char[] Array ,char ch,int cnt,int j)
    {
        if(Array.length==j) {
            return cnt;
        }
        else{
            if(Array[j]==ch){
                cnt=cnt+1;
            }
            j++;
            return (Count(Array,ch,cnt,j));
        }


    }
}//end of character class
