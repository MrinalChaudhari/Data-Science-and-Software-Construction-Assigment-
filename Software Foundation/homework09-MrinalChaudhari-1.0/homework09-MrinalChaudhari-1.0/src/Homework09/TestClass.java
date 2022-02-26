package Homework09;

import java.util.Random;
import java.util.Scanner;
public class TestClass {
    public static void main(String [] args) {   //main class starts

        /**
         * random variable is used to genrate random value of attack and health type
         * scanner is used to read the input value
         * p1 and p2 are two objects of pokemon classes that uses to pass the parameter
         */
        char ch;
        Scanner input= new Scanner(System.in);

        do {

            Pokemon p1 = new GRASS("Pikachu", "GRASS", 36, 56);
            Pokemon p2 = new FIRE("Charizard", "FIRE", 50, 80);
            Pokemon P3 = new WATER("Pigeot","WATER",60,40);
            Arena a1=new Arena();
            a1.getAttack();

            String str = new String();
            Random rnd = new Random();
            int typeattack = rnd.nextInt(2);
            int typehealth = rnd.nextInt(2);
            System.out.println("Random attack:" + typeattack);
            System.out.println("Random Health:" + typehealth);

            // Pokemon p4 = switch (typeattack);

            switch (typeattack) {
                case 0:
                    str = "FIRE";
                    break;
                case 1:
                    str = "GRASS";
                    break;
                case 2:
                    str = "WATER";
                    WATER water = new WATER();
                    break;
                default:
                    System.out.println("Type is NORMAL");
                    break;
            }

            switch (str) {

                case "FIRE":
                    Pokemon fire = new FIRE();
                    break;
                case "GRASS":
                    Pokemon grass = new GRASS();
                    break;
                case "WATER":
                    Pokemon water = new WATER();
                    break;
                default:
                    System.out.println("Type is NORMAL");
            }


            System.out.println("Would you like to watch another battle:(continue(Y/y))");
            ch= input.next().charAt(0);

        }while (ch=='Y' || ch=='y');
    }//end of main class

}//end of TestClass
