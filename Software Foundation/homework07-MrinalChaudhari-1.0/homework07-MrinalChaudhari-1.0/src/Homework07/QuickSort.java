/*Create an array filled out randomly and sort it in a descendant order using Quicksort. You can use the source file provided in the homework folder.*/

package Homework07;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int[] array, int low, int high) {
        int i = low, j = high;

        int pivot = array[low];

        System.out.println();
        System.out.println("Chosen pivot: "+pivot+" ");


        while (i <= j) {
            // If the current value from the left list is greater than the pivot
            // element then get the next element from the left list
            while (array[i] > pivot) {
                i++;
            }
            // If the current value from the right list is less than the pivot
            // element then get the next element from the right list
            while (array[j] < pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and decrease j
            if (i <= j) {
                exchange(array, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        System.out.print("with left values: ");
        for (int k = low; k <= j; k++)
            System.out.print(array[k] + " ");

        System.out.print("and right values: ");
        for (int k = i; k <= high; k++)
            System.out.print(array[k] + " ");

        System.out.print("\n");

        if (low < j)
            quicksort(array, low, j);
        if (i < high)
            quicksort(array, i, high);
    }

    private static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /** A test method */
    public static void main(String[] args) {
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
        quicksort(array,0, array.length - 1);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}


