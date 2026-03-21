package Bro.Thirty;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // JAVA DICE ROLLER PROGRAMM.

        //DECLARE VARIABLES
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int numOfDice = 0;
        int total = 0;
        boolean flag = true;


        //GET THE NUMBER OF DICE FROM THE USER
        System.out.println("Welcome to the ASCII Dice game ");
        System.out.print("How many dice do you want to roll?: ");

        while (flag) {
            if (s.hasNextInt()) {
                numOfDice = s.nextInt();

                //CHECK TO SEE IF NUMBER OF DICE IS GREATER THAN 0
                if (numOfDice > 0) {
                    flag = false;

                } else {

                    System.out.print("You need to enter a number greater than 0 with no decimals like 40, 20 or 999: ");

                }
            } else {
                s.next();
                System.out.print("You need to enter an integer i.e a number greater than 0 with no decimals like 40, 20 or 999: ");
            }

        }

        // WE WILL ROLL ALL THE DICE AND GET THE TOTAL
        for (int i = numOfDice; i > 0; i--) {
            int roll = random.nextInt(1, 7);
            total += roll;
            makeDice(roll);

        }

        System.out.printf("The total of %d dice being rolled is: %d", numOfDice, total);
        // DISPLAY THE ASCII ART OF THE DICE.

        s.close();
    }

    public static void makeDice(int roll) {
        String art = switch (roll) {
            case 1 -> "------- \n|     | \n|  0  | \n|     | \n-------";
            case 2 -> "------- \n| 0   | \n|     | \n|   0 | \n-------";
            case 3 -> "------- \n| 0   | \n|  0  | \n|   0 | \n-------";
            case 4 -> "------- \n| 0 0 | \n|     | \n| 0 0 | \n-------";
            case 5 -> "------- \n| 0 0 | \n|  0  | \n| 0 0 | \n-------";
            case 6 -> "------- \n| 0 0 | \n| 0 0 | \n| 0 0 | \n-------";
            default -> "Invalid roll!";
        };
        System.out.println(art);
    }
}
