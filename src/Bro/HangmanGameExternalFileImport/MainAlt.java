package Bro.HangmanGameExternalFileImport;

import java.util.LinkedList;
import java.util.Scanner;

public class MainAlt {
    //An alternate version of Java Hangman where all words are blanked out.
    // Only if a user types in the correct letter does it become uncovered.

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

        //5. We need to create an obfuscated version of the word. i.e apple = _,_,_,_,_ (5 spots) The best way to do this is with string builder.
        StringBuilder obfuFruit = new StringBuilder();
        for (int i = 0; i < fruit.length(); i++) {
            obfuFruit = new StringBuilder(obfuFruit + "_,");
        }

        //6. Setup some rules and tracking variables if the word is 10 char long you get 10 tries
        //Additionally i need to know when to end the game if you sucessfully complete the word.
        int lives = fruit.length();
        int charFound = 0;
        char userIn = ' ';

        //7. Make a little intro.
        System.out.println("*******************");
        System.out.println("*   Java Hangman  *");
        System.out.println("*******************");

        //8. A while loop to allow the game to keep running while both of the two conditions are true.
        // Condition 1 - You haven't found all the characters.
        // Condition 2 - You still have lives.
        while (charFound < fruit.length() && lives > 0) {


            System.out.println();
            System.out.printf("You have %d lives\n", lives);
            System.out.println(obfuFruit);
            System.out.print("Guess the word enter a character:");

            // Set a boolean for a while loop as we are about to try a dangerous operation getting user input.
            boolean goodInput = false;

            // 9. While loop to get the user input. With Try and catch
            while (!goodInput) {
                try {
                    if (s.hasNextLine()) {
                        //With Scanner there is no way of getting a character. So the best thing to do is use a String and only accept the first Character.
                        userIn = s.nextLine().charAt(0);
                        goodInput = true;
                    }
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.print("You must type in a character: ");
                }
            }

            //10. Set up a boolean outside of the for loop this is so we can track if a character was typed in is actually found.
            // if i don't put this in here and then confirm it outside the while loop.
            //if the word in apple and someone types in x. Their lives will go from 5 to 0 as it will go through the for loop 5 times
            //that will deduct a life every time.
            boolean isAChar = false;

            //11. We have all the parts now. A random word was loaded in from the text document, we have then asked user to
            //pick a character. it will not check that character against every character in the fruit.
            //If the character is a match we will unobfuscate it.
            for (int i = 0; i < fruit.length(); i++) {

                if (Character.toLowerCase(fruit.charAt(i)) == Character.toLowerCase(userIn)) {
                    //Because we use _, the best way to ensure that we place the character is placed in the right place is to multiply by 2.
                    // ie . if the the word was Apple we would obfuscate like _,_,_,_,_, if we type A then 0 * 2 = 0 it will put an A in position 0 of the Obfuscated
                    // if we type e then that will count 0,1,2,3,4 4 *2 = 8 which is the correct index on the Obfuscated code.
                    obfuFruit.setCharAt(i * 2, fruit.charAt(i));
                    charFound++;
                    isAChar = true;
                }

            }
            //10a Continued. Only after the for loop has run if the character typed in isn't found during the for loop the isAChar isn't made true
            //Therefore we deduct a life.
            if (!isAChar) {
                lives--;
            }

        }
        //12. This is just ending the game on a high or a low depending on the success.
        if (charFound == fruit.length() && lives > 0) {
            System.out.printf("Woohoo you win you found the word %s", fruit);
        } else {
            System.out.printf("Too bad you lost! the word was %s", fruit);
        }

        s.close();
    }


}



