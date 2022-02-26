/*Write a program that alphabetically sorts countries along with their corresponding populations.*/

package Homework06;

import java.util.Scanner;
import java.util.Arrays;
public class CountrySort {
    /**
     *
     * @param args
     * user enter two inputs for country name and population of corresponding country
     */
    public static void main(String args[])         //main class
    {
        String[] arr1 = new String[5];//array to store country name

        int [] arr2 = new int [5];               //array to store population of country
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr1.length; i++)              //first for loop to accept data from user
        {
            System.out.println(" Enter name of country: ");
            arr1[i] = input.nextLine();
            System.out.println(" Enter population of country: ");
            arr2[i] = input.nextInt();
            input.nextLine();
        }
        System.out.println("Before sorting countries name alphabetically!!");
        for(int i=0;i< arr1.length;i++)             //second for loop to print country's name and population
        {
            System.out.println(" Country: " +arr1[i]+ " , Population: " +arr2[i]);
        }
        System.out.println();

        String[] country=new String[arr1.length];

        for(int i=0;i< arr1.length;i++)
        {
            country[i]=arr1[i];
        }

        /**
         *  string array is storing with another array for sorting country's name
         *  double for loop used to iterate through coutry's name and comparing minimum value in second for loop with name
         *  else part swap the countries name using temp variable
         */
        int min = 0,i;
        String temp="";
        for( i=0;i< country.length;i++)
        {
            min=i;
            for(int j=i+1;j< country.length;j++)
            {
                if(country[j].compareTo(country[min])<0){
                    min=j;
                }

            }
            temp=country[i];
            country[i]=country[min];
            country[min]=temp;
        }

        int [] population=new int[5];
        Arrays.sort(country);
        for(i=0;i< arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                if(arr1[j].equals(country[i])){
                    population[i]=arr2[j];
                }
            }
        }
        System.out.println("Country and population names alphabetically as follows");

       for(i=0;i< arr1.length;i++)
        {
            System.out.println( country[i]+ " - " +population[i]);
        }
    }//end of main class
}//End of CountrySort class