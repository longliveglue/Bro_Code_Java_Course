package Bro.TwentyTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double randomNumber = Math.random() * 100;
        int gameNumber = (int) randomNumber;
        int userNumber = 0;
        int counter = 0;

        System.out.println(gameNumber);

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game. Try and guess the number which is between 1 and 100");
        do {
            counter++;
            System.out.print("Enter your number between 1 - 100: ");
            if (s.hasNextInt()) {
                userNumber = s.nextInt();
                if (userNumber < 0 || userNumber > 100) {
                    System.out.println("Your number wasn't within the 1 to 100 range try again");
                    if (counter == 1) {
                        counter = 0;
                    } else if (counter > 1) {
                        counter--;
                    }
                } else if (userNumber > gameNumber) {
                    System.out.println("Too High, try again.");
                } else if (userNumber < gameNumber) {
                    System.out.println("Too Low, try again.");
                }

            } else {
                System.out.println("Please enter a integer i.e a whole number 0 or 45 or 21 ");
                s.next();
                if (counter == 1) {
                    counter = 0;
                } else if (counter > 1) {
                    counter--;
                }
            }

        } while (userNumber != gameNumber);

        System.out.printf("Yay you guessed the right number %d and it only took you %d %s.", gameNumber, counter, (counter > 1) ? "guesses" : "guess");

    s.close();
    }

}
