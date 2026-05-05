package Bro.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exception = an event that interrupts the normal flow of a program
        // (Dividing by Zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

        Scanner s = new Scanner(System.in);
        int age = 0;

        while (age == 0) {
            System.out.print("What is your age?:");
            try {
                age = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You didn't type a character ");
                s.next();
                //Finally always runs its usually for resources clean up.
            }  finally {
                s.close();
            }
        }

        System.out.printf("Cool your %d", age);


    }
}
