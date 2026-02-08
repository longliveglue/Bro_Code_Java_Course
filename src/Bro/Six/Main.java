package Bro.Six;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //SHOPPING CART PROGRAM.
        //VERY BASIC.

        Scanner s = new Scanner(System.in);
        String itemName;
        double price;
        int quantity;
        double total;

        System.out.print("What item would you like to buy?: ");
        itemName = s.nextLine();
        s.reset();
        System.out.print("\nWhat is the price for each item?: ");
        price = s.nextDouble();
        s.reset();
        System.out.print("\nHow many do you want to have?: ");
        quantity = s.nextInt();

        total = price * (double) quantity;

        System.out.println("\nYou have bought " + quantity + " " + itemName + "'s");
        System.out.printf("\nYour total cost is: $%.2f%n" , total);
        s.close();
    }
}
