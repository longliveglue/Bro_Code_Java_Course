package Bro.TwentySix;

public class Main {

    //Methods otherwise known as functions.

    public static void main(String[] args) {

        happyBirthday(1, "Tom", 29);
        System.out.println();
        happyBirthday(3, "Laura");

        double number = 3;

        double squaredNumber = square(number);
        double cubedNumber = cube(number);

        System.out.println(squaredNumber);
        System.out.println(cubedNumber);

        System.out.println();

        String first = "Tom";
        String last = "Hamilton";

        String full = fullName(first, last);
        System.out.println(full);

        int age = 19;

        if (ageCheck(age)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You are too young for a credit card");
        }

    }

    // A method that takes 3 arguements and sings happybirthday to a person says their age and using Ternary corrects if its year old or years old.
    public static void happyBirthday(int repeat, String name, int age) {

        for (int i = repeat; i > 0; i--) {
            System.out.println("Happy Birthday to you");
            System.out.printf("Happy Birthday dear %s, you are %d %s old \n", name, age, (age > 1) ? "years" : "year");
        }
    }

    // An overloaded method that only takes 2 arguements instead of 3.
    public static void happyBirthday(int repeat, String name) {

        for (int i = repeat; i > 0; i--) {
            System.out.println("Happy Birthday to you");
            System.out.printf("Happy Birthday dear %s, you are \n", name);
        }

    }


    // A method that takes 1 arguement and then times it by itself.
    public static double square(double number) {
        return number * number;
    }

    //A method that returns a value cubed.
    public static double cube(double number) {
        return number * number * number;
    }

    public static String fullName(String first, String last) {
        return first + " " + last;
    }

    public static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }


}
