
package homework;
import java.util.Random;            //java random utility package
import java.util.Scanner;
public class Number
{
    /**
     *
     * @param args Main class taking input from user using scanner class
     */
    public static void main(String[] args) {
        Random input1 = new Random();
        Scanner input2 = new Scanner(System.in);
        int Fguess,random;
        random = input1.nextInt(10);
        random = random+1;
        System.out.println("Attempt 1:Enter Guess number between 1 to 10:");
        Fguess = input2.nextInt();                  //reads inputs from user
        boolean value1 = Guess(Fguess,random);
        if(value1==true){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Attempt 2:Enter Guess for a second time between 1 to 10:");
            int Sguess = input2.nextInt();
            boolean value2 = Guess(Sguess,random);
            if(value2 == true){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Attempt 3:Enter Guess for a last time between 1 to 10:");
                int Lguess= input2.nextInt();
                boolean value3 = Guess(Lguess,random);
                if(value3 == true){
                    System.out.println("Correct!");
                }
                else{
                    System.out.println("False");
                }
            }
        }
    }

   public static boolean Guess(int random,int guess )
    {
        if(guess > 10){
            System.out.println("Not a valid number");
            return(false);
        }
        if(guess==random) {
            return (true);
        }
        else if(guess > random){
            System.out.println("Too High!");
            return (false);
        }
        else{
            System.out.println("Too Low!");
            return (false);
        }
    }
    /**
     * Guess is a method that returns boolean value as mentioned in PDF.
     * random number is assigned from java random utility.
     * Fguess is a number entered from user.
     * Boolean value returns to main funtion and main function has if else statement for executing three user attempts
     */

}
//End of Class Number