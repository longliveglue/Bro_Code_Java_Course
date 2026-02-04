package Bro.Four;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // MAD LIBS GAME.

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;


        System.out.print("\nType in an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("\nType in a Noun: ");
        noun1 = scanner.nextLine();


        System.out.print("\nType in another adjective: ");
        adjective2 = scanner.nextLine();


        System.out.print("\nType in a verb ending in -ing: ");
        verb1 = scanner.nextLine();


        System.out.print("\nType in the final adjective: ");
        adjective3 = scanner.nextLine();

        scanner.close();


        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibt, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");


    }
}
