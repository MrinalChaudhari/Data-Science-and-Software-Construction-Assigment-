/*Implement the mergeSort algorithm.write a program that randomly creates an array, and displays it before and after the sorting.  */

package Homework06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MergeSort
{
    /**
     *
     * @param array merge subarrays in array[k]
     * @param @arr1 is subarray of splitted array and arr2 is subarray of splitted array.
     * @param mid is the median of array
     */
    public static void merge(int array[], int left, int mid, int right)
    {
        //size of subarrays
        int arr1 = mid - left + 1;
        int arr2 = right - mid;

        //creation of temp arrays
        int Left_arr[] = new int [arr1];
        int Right_arr[] = new int [arr2];

        //data in temp array
        for (int i=0; i<arr1; ++i)
            Left_arr[i] = array[left + i];
        for (int j=0; j<arr2; ++j)
            Right_arr[j] = array[mid + 1+ j];

        int i = 0, j = 0;
        //mergging of subarrays
        int k = left;
        while (i < arr1 && j < arr2)
        {
            if (Left_arr[i] <= Right_arr[j])
            {
                array[k] = Left_arr[i];
                i++;
            }
            else
            {
                array[k] = Right_arr[j];
                j++;
            }
            k++;
        }
        //remaining elements are getting copied in left array
        while (i < arr1)
        {
            array[k] = Left_arr[i];
            i++;
            k++;
        }
        //remaining elements are getting copied in right array
        while (j < arr2)
        {
            array[k] = Right_arr[j];
            j++;
            k++;
        }
    }

    // merge()
    public static void sort(int array[], int left, int right)
    {
        if (left < right)
        {
            // Find the middle point
            int mid = (left+right)/2;

            // Sort first part of the array
            sort(array, left, mid);
            // Sort second part of the array
            sort(array , mid+1, right);

            // merge the sorted part and combine together
            merge(array, left, mid, right);
        }
    }

    /**
     * Random utility generates random varible
     * @size user defined variable for size of array, random variable generated values equal to size of array
     * @Scanner reads input from user
     */
    public static void main(String args[])
    {

        Random RNG = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int Size = input.nextInt();

        System.out.println("Before Sorting");
        int[] array = new int[Size];
        for (int i = 0; i < array.length; i++) {
            array[i] = RNG.nextInt(Size);
            System.out.println(array[i]);
        }
        MergeSort ob=new MergeSort();
        ob.sort(array, 0, array.length-1);
        System.out.println("after Sorting Array is:");
        System.out.println(Arrays.toString(array));

    }//end of main class

}//end of MergeSort class