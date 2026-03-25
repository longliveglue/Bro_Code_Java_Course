package Bro.Arrays;

import java.util.Arrays;

public class Main {
    // array = a collection of value of the same data type.
    // * think of it as a variable that can store more than 1 value.
    // Arrays are a fixed size.

    public static void main(String[] args) {
        String[] fruit = {"Orange", "Banana", "Coconut", "Apples"};

        // This is a regular For loop which i going through the array
        for (int i = 0; i < fruit.length; i++) {

            System.out.println(fruit[i]);
        }
        // This is an enhanced for loop.
        // We say for to make the for loop
        // We tell the for loop what data type we will be looping through in the below case its Strings
        // We then say what the index/name the items will be called so that we can call it in the code within the for loop like we have done here.
        // We then do a : and then the array we want to cycle through.
        //Note System.out.println(items)
        for (String items : fruit) {
            System.out.println(items);
        }

        System.out.println();

        // We can also sort our array using the Method Arrays.
        Arrays.sort(fruit);
        System.out.println("Sorted Array using Enhanced For loop");
        for (String items : fruit) {
            System.out.println(items);
        }
    }


}
