package Bro.RockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //ROCK PAPER SCISSORS GAME

    public static void main(String[] args) {

        //CREATE VARIABLES
        Scanner s = new Scanner(System.in);
        String[] tools = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int computerChoice;
        int userChoice;
        boolean flag = true;
        int score = 0;
        int compScore = 0;

        //Create a message stating the purpose of the game.
        System.out.println("""
                ##########################################################
                #            Welcome to Rock Paper Scissors              #
                #  Rules: Pick between 1. Rock, 2. Paper or 3. Scissors  #
                #                 Rock beats Scissors                    #
                #                 Scissors beats Paper                   #
                #                  Paper beats Rock                      #
                ##########################################################
                """);
        System.out.println();

        //Create a while loop to allow people to continue to play.
        while (flag) {
            //Get a user choice either rock paper or scissors.
            System.out.println();
            System.out.println("Pick your tool");
            System.out.print("Press 1 for Rock, Press 2 for Paper, Press 3 for Scissors and Press any other key to exit: ");

            //Get the user input and do some data validation if its not a integer exit the program
            if (s.hasNextInt()) {
                userChoice = s.nextInt();

                //Make sure the numbers are between 1-3 if no exit the game.
                if (userChoice > 0 && userChoice < 4) {
                    userChoice = userChoice - 1;
                    computerChoice = random.nextInt(0, 3);

                    if (userChoice == computerChoice) {
                        System.out.printf("User picked: %s and the computer picked %s its a Draw ", tools[userChoice], tools[computerChoice]);
                        System.out.println();
                    } else if (userChoice == 0 && computerChoice == 2) {
                        System.out.printf("User picked: %s and the computer picked %s you win ", tools[userChoice], tools[computerChoice]);
                        System.out.println();
                        score++;
                    } else if (userChoice == 1 && computerChoice == 0) {
                        System.out.printf("User picked: %s and the computer picked %s you win ", tools[userChoice], tools[computerChoice]);
                        System.out.println();
                        score++;
                    } else if (userChoice == 2 && computerChoice == 1) {
                        System.out.printf("User picked: %s and the computer picked %s you win ", tools[userChoice], tools[computerChoice]);
                        System.out.println();
                        score++;
                    } else {
                        System.out.printf("User picked: %s and the computer picked %s you lose ", tools[userChoice], tools[computerChoice]);
                        compScore++;
                    }
                    System.out.println();
                    System.out.println("User score is " + score + " The computer score is " + compScore);
                } else {
                    //The number wasn't between 1-3 so exit the game
                    flag = false;
                    System.out.println("Ending Game");
                }
            } else {
                //They didn't enter an int so yet again exit the game.
                flag = false;
                System.out.println("Ending Game");
            }
        }

        s.close();
    }

}
