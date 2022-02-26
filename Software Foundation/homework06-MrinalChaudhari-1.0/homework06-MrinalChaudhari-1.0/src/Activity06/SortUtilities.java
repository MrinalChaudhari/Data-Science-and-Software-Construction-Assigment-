package Activity06;

import java.util.Random;

import java.util.Scanner;

public class SortUtilities {

    public static void main(String args[])
    {
        int[] array = {1,2,3,4,5};
        System.out.println("Before Selection Sort");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(sorted(array));
        makeArray();
    }
    public static boolean sorted(int [] array)
    {
        for (int i = 0; i < array.length-1; i++)
        {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static void makeArray()
    {
         Random RNG=new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int Size = input.nextInt();

        int[] array = new int[Size];
        for (int i = 0; i < array.length; i++) {
            array[i] = RNG.nextInt(Size);
            System.out.print(array[i]+ "," );
        }

    }

}
