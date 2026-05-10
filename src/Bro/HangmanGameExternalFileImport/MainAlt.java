package Bro.HangmanGameExternalFileImport;

import java.util.LinkedList;
import java.util.Scanner;

public class MainAlt {
    //An alternate version of Java Hangman where all words are blanked out.

    public static void main(String[] args){
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

        StringBuilder obfuFruit = new StringBuilder();

        for (int i = 0; i < fruit.length(); i++){
            obfuFruit = obfuFruit + "_,";
        }


    }


}
