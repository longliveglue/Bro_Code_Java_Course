package Bro.Seven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //If statements = performs a block of code if its condition is true.

        int age;
        String name;
        boolean isStudent;

        Scanner s = new Scanner(System.in);

        //Group 1 question
        System.out.print("What is your name? :");
        name = s.nextLine();

        //Group 2 questions
        System.out.print("\nHow old are you? : ");
        age = s.nextInt();

        //Group 3 question
        System.out.print("\nAre you a a student? (true or false) ");
        isStudent = s.nextBoolean();

        //Group 1 Name Logic.
        if(name.isEmpty()){
            System.out.println("\nYou didn't enter a name 😑");
        } else {
            System.out.println("\nNice to meet you " + name + "😎");
        }

        //Group 2 Age Logic.
        if (age < 0) {
            System.out.println("\nYou haven't been born yet! 👻");
        } else if (age < 5) {
            System.out.println("\nYour not even five, i'm calling the police on your parents! 👮🏼‍♀️");
        } else if (age < 13) {
            System.out.println("\nYour not even 13 ofcourse you can't have a beer! 👶🏻");
        } else if (age < 18) {
            System.out.println("\nYour still " + (((18 - age) == 1)?  (18 - age) + " year": (18 - age) +  " years" )+ " too young to have a beer!");
        } else {
            System.out.println("\nYour " + age + " years old here is your well earned beer 🍺 ");
        }

        //Group 3 School and age logic.

        if (age < 5 && age > 0 && isStudent){
            System.out.println("\nYour a kindergartener 👶🏻");
        } else if ( age < 11 && isStudent){
            System.out.println("\nYou are a primary school student 👩🏼‍🏫");
        } else if ( age < 18 && isStudent){
            System.out.println("\nYou are a high school student 🏫");
        } else if ( age > 18) {
            System.out.println("\nYou goto University or College 🎓");
        } else {
            System.out.println("\nYour NOT a student 💁🏼");
        }

        s.close();

    }
}
