package Bro.JavaSlotMachine;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We will need user Input so we need to open the scanner.
        Scanner s = new Scanner(System.in);

        // We will need to put those random numbers into an Array during each spin
        int[] the3Numbers = new int[3];

        // We need to have some symbols to display.
        String[] symbols = {"🍊", "🍓", "🍍", "🍎"};

        //The user needs a balance starting at £100.00
        double balance = 100.00;

        //We need a boolen to check if they have enough balance.
        boolean hasBalance = true;

        System.out.println("""
                ***************************************
                *     Welcome to Tommy Slots          *
                *     Enter an amount to bet          *
                *  The amount can between £1 - £10    *
                *   If you get 3 Matching 🍊🍓🍍🍎   *
                *           Double your Bet           *
                *   If you get 2 Matching 🍊🍓🍍🍎   *
                *           Keep your Bet           *
                * Everything else you lose your money *
                ***************************************
                """);


        while (hasBalance) {


            boolean flag = true;

            while (flag) {
                System.out.printf("\nYour Balance is £%.2f\n", balance);
                System.out.print("Place your bet up to the maximum of your balance or type in any other character to quit: ");

                if (s.hasNextDouble()) {
                    double bet = s.nextDouble();

                    if (bet > 0 && bet <= balance) {
                        // They have placed a bet that is greater than 0 but doesn't exceed their balance

                        //deduct the bet from their balance
                        balance = balance - bet;

                        // We now spin the numbers in the array.
                        spin(the3Numbers);

                        // We now need to print the result of the spin by going into the array the3Numbers and checking the values.
                        for (int symb : the3Numbers) {
                            System.out.print(" [" + symbols[symb] + "] ");
                        }

                        //Check for 3 symbols matching if so double their bet and add it to the balance
                        if (the3Numbers[0] == the3Numbers[1] && the3Numbers[0] == the3Numbers[2]) {
                            balance = balance + (bet * 2);
                            System.out.println("\nYou matched 3 Symbols you double your bet");
                            //If 3 symbols don't match then check for 2 symbols. If they match return their bet.
                        } else if (the3Numbers[0] == the3Numbers[1] || the3Numbers[1] == the3Numbers[2] || the3Numbers[0] == the3Numbers[2]) {
                            balance = balance + bet;
                            System.out.println("\nYou matched 2 Symbols you get your bet back");
                        } else {
                            System.out.println(" -> You lose");
                            if (balance <= 0) {
                                hasBalance = false;
                                flag = false;
                                System.out.println("You lost all your money");
                            }
                        }


                    } else {
                        System.out.print("Bet must be between £1 and your current balance: ");
                        continue;
                    }
                } else {
                    flag = false;
                    hasBalance = false;
                    System.out.println("You Quit");
                    break;
                }

            }


        }

        System.out.println(balance > 99 ? "\nYou beat the house" : "\nBetter luck next time");

        //Close the Scanner
        s.close();
    }

    public static void spin(int[] the3Numbers) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            the3Numbers[i] = random.nextInt(0, 4);
        }
    }
}
