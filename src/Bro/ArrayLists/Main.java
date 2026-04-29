package Bro.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ArrayList = A resizeable array that stores objects (Autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        // Ensure you put the Object in the <> this is called generics. It ensures that everyone knows what type of object can be added to that array list.
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Because we used the wrapper class Integer(Which is an object) we can add primitive numbers to the Array list
        list.add(3);
        list.add(1);
        list.add(2);

        // We can then print all elements of the list one after the other.
        System.out.println(list);


        // Or we can print them out individually.
        for (Integer listItem : list) {
            System.out.println(listItem);
        }


        // We can make an array list called fruits that holds the string object.
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Banana");
        fruits.add("Tomatoes");
        fruits.add("Apple");

        System.out.println(fruits);
        // We can remove objects at indexes.
        fruits.remove(0);
        System.out.println(fruits);

        // We can also change the contents of array indexes.
        fruits.set(1, "Pineapple");

        System.out.println(fruits);

        String fruit = fruits.get(1);
        System.out.println(fruit);

        // To Sort array lists.

        Collections.sort(fruits);
        System.out.println(fruits);


        Scanner s = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<String>();


        boolean flag = true;
        System.out.println("Welcome to the shopping list generator type what you want to add to your shopping list");
        while (flag) {

            System.out.print("Type in an item to add or type exit to exit: ");

            String userInput = s.nextLine();
            if (!userInput.equalsIgnoreCase("exit")) {
                userInput.toLowerCase();
                userInput.toUpperCase().charAt(0);
                System.out.println(userInput);

                shoppingList.add(userInput);

            } else {
                for (int i = 0; i < shoppingList.toArray().length; i++) {
                    int tracker = i + 1;
                    System.out.println(tracker + ". " + shoppingList.get(i));
                }
                flag = false;
            }
        }

        s.close();

    }


}


