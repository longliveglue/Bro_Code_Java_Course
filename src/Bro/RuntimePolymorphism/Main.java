package Bro.RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    //Runtime Polymorphism = When the method that gets executed is decided.
    //                       at runtime based on the actual type of the Object.



    public static void main(String[] args){

     Animal animal = null;
     int userChoice;

        Scanner s = new Scanner(System.in);

        System.out.print("Press 1 for a dog or 2 for a cat: ");
        userChoice = s.nextInt();

        switch (userChoice){
            case 1 -> animal = new Dog();
            case 2 -> animal = new Cat();
        }

        animal.speak();

    }

}
