package Bro.TwentyFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nested loop = A loop inside another loop.
        // Often used within Matrices or Data Structures & Algorithms.

        // We could create a matrix like the below. But its inefficient.
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Above done with three seperate for loops.");
        System.out.println();
        System.out.println("Below done with two for loops one nested inside the other");


        // Instead we will use a nested for loop

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // Now we will make a programm that will create a matrix of user defined rows and colums of any character that a user wants.

        Scanner s = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        String userChar = "";


        while (rows <= 0) {
            System.out.print("Enter the number of rows it must be 1 or greater: ");
            if (s.hasNextInt()) {
                rows = s.nextInt();
            } else {
                System.out.println("You didnt enter a number greater than 0 try again: ");
                s.next();
            }

        }

        while (columns <= 0) {
            System.out.print("Enter the number of columns it must be 1 or greater: ");
            if (s.hasNextInt()) {
                columns = s.nextInt();
            } else {
                System.out.println("You didnt enter a number greater than 0 try again: ");
                s.next();
            }

        }
        s.nextLine();
        boolean flag = true;
        while (flag) {
            System.out.print("Enter a single character: ");
            if (s.hasNextLine()) {
                userChar = s.nextLine();
                userChar = userChar.toUpperCase().substring(0, 1);
                flag = false;
            } else {
                System.out.println("You didnt enter a character: ");
                s.next();
            }

        }

        System.out.println();
        System.out.println();

        System.out.printf("Rows %d Columns %d Character %s", rows, columns, userChar);

        System.out.println();
        System.out.println();

        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(userChar);
            }
            System.out.println();


        }

        s.close();
    }
}
