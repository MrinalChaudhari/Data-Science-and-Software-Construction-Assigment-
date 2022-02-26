/**
 * In a program you need to store the populations of 5 countries.
 * a. Define two arrays that may be used in parallel to store the names of the countries and their populations.
 * b. Ask the user to fill out the information related to the two arrays.
 * c. Save the answers in the two arrays.
 * d. Write a loop that uses these arrays to print each country's name and its population.
 * e. Write code that calculates the average population of all countries.
 */


package Homework04;

import java.util.Scanner;

/**
 * String and double array initialise with value 5.
 * forloop use to print only 5 countries of data
 * arr1 and arr2 reads input from user using scanner utility from java
 * another for loop use to print stored value of country and population
 *
 */

public class Country {                          //country class

    public static void main(String args[])         //main class
    {
        String[] arr1=new String[5];                //array to store country name
        double[] arr2= new double[5];               //array to store population of country
        int sum=0;
        int n=5;
        float Average=0;

        Scanner input= new Scanner(System.in);

        for(int i=0;i<arr1.length;i++)              //first for loop to accept data from user
        {
            System.out.println(" Enter name of country: ");
            arr1[i]=input.nextLine();
            System.out.println(" Enter population of country: ");
            arr2[i]=input.nextDouble();
            input.nextLine();
            sum+=arr2[i];                           //addition of data entries from array2 (population)
            //System.out.println("Sum of population is:" +sum);

        }
        for(int i=0;i< arr1.length;i++)             //second for loop to print country's name and population
        {
            System.out.println(" Country: " +arr1[i]+ " , Population: " +arr2[i]);
        }

        Average = (float) sum / n;                  //average=sum/total no of country
        System.out.println(" ");
        System.out.println(" Average of 5 country: " + Average);
    }                                               //end of main class

}                                                   //end of class
