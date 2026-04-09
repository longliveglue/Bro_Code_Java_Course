package Bro.Varargs;

public class Main {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments.
        //           makes methods more flexible, no need for overloaded methods.
        //           java will pack the arguements into an array
        //           ... (ellipsis)

        add(12, 15, 10, 66);

        System.out.println("The average is: " + average(10, 15, 22, 66, 4));
    }

    // I have now created a varargs method. As you can see we are essentially declaring an Array of Ints.
    // The calling arguement with x numbers above will dictate how many elements are int the array.
    public static void add(int... numbers) {

        //if I want a method that add up all the numbers i create a int variable called sum and then i will call a for loop.

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    // Another varargs method is below. It will take a number of numbers and make an array.
    // i will then sum the ints in a for loop and then divide them by numbers.length to find the average.
    public static int average(int... numbers) {
        int average = 0;

        for (int number : numbers) {
            average += number;
        }
        return average = average / numbers.length;

    }
}
