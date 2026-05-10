package Bro.HangmanGameExternalFileImport;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //JAVA HANGMAN GAME WITH RANDOM OBFUSCATION

        //1 Set the file path and load Scanner
        String filePath = "src/Fruits.txt";
        Scanner s = new Scanner(System.in);

        //2. Create a linked list ready to recieve a list of parsed words
        LinkedList<String> fruits;

        //3 Send the text document to a fileLoader to parse the data and return a linkedlist of single words.
        fruits = FileLoader.list(filePath);

        //4. Pick a random word from the Linked List.
        String fruit = RandomItem.randomItem(fruits);
        System.out.println(fruit);

        //5. Send the word off for obfuscation.
        String obFruit = RemoveChars.removeChars(fruit);

        //6. Create the Intro for Hangman.
        System.out.println("""
                *********************************
                *    Welcome to Java Hangman    *
                *********************************
                """);

        //7. Create a while loop to track the number of mistakes 2 per game otherwise lose.
        int livesTracker = 2;

        while (livesTracker > 0) {

            System.out.println("Guess the word: ");
            System.out.print(obFruit);
            System.out.print(": ");

            String userGuess = s.nextLine().trim().toLowerCase();
            if (userGuess.equalsIgnoreCase(fruit)) {
                break;
            } else {
                livesTracker--;
                if (livesTracker > 0) {
                    System.out.println();
                    System.out.println("Wrong try again:");
                    System.out.println();
                }
            }

        }

        if (livesTracker > 0) {
            System.out.println("Congrats you Won!");
        } else {
            System.out.println("Too Bad you Lose!");
        }

        s.close();
    }
}
