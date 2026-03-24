package Bro.ThirtyThree;

import java.util.Arrays;
import java.util.Scanner;

// SEARCHING ARRAYS.  If we want to search for an item in an array we need to use for loops.


public class Main {
    public static void main(String[] args) {

        //We Create a number of Arrays with some fruits in
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;
        Scanner s = new Scanner(System.in);

        // Get the name of the fruit from the user
        System.out.print("Enter the name of the fruit that you wish to search for: ");
        target = s.nextLine();


        // Use a for loop to iterate through each of the positions on the Array to see if the item the user searched for can be found.
        for (int i = 0; i < fruits.length; i++) {

            // if the item is found then sort the word case out so that it starts with a captial letter and looks tidy.
            if (fruits[i].equalsIgnoreCase(target)) {
                String fruitName = fruits[i].substring(0, 1).toUpperCase();
                fruitName = fruitName + fruits[i].substring(1, fruits[i].length());
                System.out.println(fruitName + " was found at index: " + i);
                //If the item is found we need to set the isFound to true which will allow the next peice of the code to trigger.
                isFound = true;

                // We don't want to iterate through the code now that we have found the item we can simply break out of the for loop using break.
                break;
            }
        }

        // This is triggered if we don't find the item.
        if (!isFound) {
            System.out.println("That item doesn't exist in our database sorry.");
        }


        int[] numbers = {4, 1, 2, 32, 16};
        // This is a refresh on the sorting. An array of ints are fed in.
        // Its also a refresh on enhanced for loops.
        System.out.println();

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.sort(numbers);


        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
