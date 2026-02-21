package Bro.Fifteen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        //Declare Variables
        Scanner s = new Scanner(System.in);
        String userChoice;
        boolean checker = true;

        //Welcome message
        System.out.println("\nHey welcome to my weight converter");
        while (checker) {
            s.reset();
            System.out.println("\n1 to convert Kg to lbs or Press 2 to covert lbs to Kg or finally 0 or to quit.");
            userChoice = s.nextLine();

            if (userChoice.contains("1")) {
                kgToLbs(s);

            } else if (userChoice.contains("2")) {
                System.out.println("Made it to 2");
                lbsToKg(s);

            } else if (userChoice.contains("0")) {
                System.out.println("Goodbye thanks for picking Toms weight Converter");
                checker = false;
            } else {
                System.out.println("You entered an invalid choice.");
            }

        }

        s.close();
    }

    public static void kgToLbs(Scanner d) {
        double userInput;
        System.out.print("How many Kgs do you need to convert? (e.g., 75.5): ");

        // 1. Validation Loop
        while (!d.hasNextDouble()) {
            d.next(); // Clear the "bad" input (like "abc")
            System.out.print("Invalid input. Please enter a number: ");
        }

        // 2. Grab the valid number AFTER the loop finishes
        userInput = d.nextDouble();
        d.nextLine();// <--- CRITICAL: This "swallows" the Enter key leftover in the buffer

        // 3. Logic & Output
        double lbs = userInput * 2.20462;
        System.out.printf("%.2fkg converted to lbs is %.2flbs\n", userInput, lbs);

    }

    public static void lbsToKg(Scanner d) {
        double userInput;
        System.out.print("How many Kgs do you need to convert? (please enter a number greater than 0.00) : ");

        // 1. Validation Loop
        while (!d.hasNextDouble()) {
            d.next();
            System.out.print("Invalid input. Please enter a number: ");
        }

        // 2. Grab the valid number AFTER the loop finishes
        userInput = d.nextDouble();
        d.nextLine();// <--- CRITICAL: This "swallows" the Enter key leftover in the buffer

        // 3. Logic & Output
        double kg = userInput / 2.20462;
        System.out.printf("%.2fkg converted to lbs is %.2flbs\n", userInput, kg);


    }


}
