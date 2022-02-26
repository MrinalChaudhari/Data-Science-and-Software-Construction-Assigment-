Package Activity05;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String args[])
    {
        int array[] = {1,2,3,6,5,8,9,8,7,33,66,54,88,44};
        int target;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter target value:");
        target=input.nextInt();
        System.out.println("Array:"+Arrays.toString(array));
        search(array,target);

    }
    public static void search(int[] array, int target)
    {
        boolean value=false;
        for(int element:array){
            if(element==target){
                value=true;
                break;
            }
        }
        System.out.println(value);
    }
}
