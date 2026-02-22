package Bro.Sixteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TERNRARY OPERATOR (Condition)? if the condition is true then run this side : if the condition is false then run the code on this side;

        int one = 0;
        int two = 15;
        boolean isTrue = false;
        Scanner s = new Scanner(System.in);

        while (one < 1 || one > 100) {
            System.out.print("Give me a number between 1 - 100: ");

            if (s.hasNextInt()) {
                one = s.nextInt();
            } else {
                System.out.println("That's not a number!");
                s.next(); // IMPORTANT: This clears the invalid input
            }
        }

        System.out.println();
        System.out.println((one < two ? one + " is less than number " + two : one + " is greater than number " + two));
        System.out.println();
        System.out.println(isTrue ? "istrue is true " : "isTrue is false");

        System.out.println();
        String evenOrOdd = (one % 2 == 0) ? "Your number is even" : "Your number is Odd";
        System.out.println(evenOrOdd);


    }
}
