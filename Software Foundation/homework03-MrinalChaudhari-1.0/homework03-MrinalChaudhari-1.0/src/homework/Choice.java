package homework;

import java.util.*;
public class Choice {

    /**
     *
     * @param args
     * Main class accept value from user and pass it to switch case.
     */

    public static void main(String args[])
    {

        Scanner input=new Scanner(System.in);

        System.out.println("!You have Two Options!");
        System.out.println("1 Music");
        System.out.println("2 Movie");
        System.out.println("Enter 1 or 2:");
        int N= input.nextInt();


        switch (N)
        {
            case 1 :
                System.out.println("Music");
                System.out.println("Do you like Opula house band?? ");
                String srt=input.nextLine();
                System.out.println("Enter 1 for 'Yes' and 3 for 'No' ");
                int M= input.nextInt();
                switch (M)
                {
                    case 1:
                        System.out.println("You have a good taste!");
                        break;
                    case 3:
                        System.out.println("No accounting for taste");
                        break;
                }
                break;

                case 2:
                System.out.print("Which star was episode was best:");
                int B= input.nextInt();
                if((B==4) || (B==5))
                {
                    System.out.println("I agree");
                }
                else if((B==1) || (B==2) || (B==3))
                {
                    System.out.println("Um, No");
                }
                else if((B==6) || (B==7))
                {
                    System.out.println("I like those, too!");
                }
                else
                {
                    System.out.print("Invalid episode!!");
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}// choice class ends
