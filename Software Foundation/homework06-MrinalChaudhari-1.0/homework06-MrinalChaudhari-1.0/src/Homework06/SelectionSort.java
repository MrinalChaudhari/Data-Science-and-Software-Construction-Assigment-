/*Implement Selection sort algorithm in descendant order .write a program that randomly creates an array, and displays it before and after the sorting.*/

package Homework06;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {
        /**
         * Random utility generates random varible
         * @size user defined variable for size of array, random variable generated values equal to size of array
         * @Scanner reads input from user
         */
        int min;
        Random RNG = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int Size = input.nextInt();

        System.out.println("Before Sorting elements are");
        int[] array = new int[Size];
        for (int i = 0; i < array.length; i++) {
            array[i] = RNG.nextInt(Size);
            System.out.print(array[i]+ ",");
        }
        /**
         * First outer loop iterate from 0 to end of array
         * inner j loop finds the minimum value from array
         * iterating through unsorted element from array
         * and comparing minimum value with j from array (to find minimum value)
         * Swap the min value with higher one.(swapping with j and i value)
         */
        int n=array.length;
        for (int i = 0; i < n; i++) {
            min=i;
            for (int j = i; j < n; j++){
                if (array[min] < array[j]) {
                    min = j;
                }
            }
            int temp= array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        System.out.println();
        System.out.print("After sorting input array: ");
        print(array);
    }
    public static void print(int[] values) {
        for (int val : values) {
            System.out.print(val + " ");
        }
    }//end of main class
}//end of SelectionSort class
