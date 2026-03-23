package Bro.ThirtyTwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size;

        System.out.print("Hey how many foods do you want to eat?: ");
        size = s.nextInt();
        s.nextLine();

        String[] foods = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("What is the %d food that you want to eat? : ", i + 1);
            foods[i] = s.nextLine();

        }

        // Using the enhanced for loop
        System.out.print("Cool so you want to eat ");

        for (String food : foods) {
            System.out.print(food + ", ");
        }

        System.out.println();

        //Using a regular for loop for a bit more detail
        System.out.print("Cool so you want to eat");
        for (int i = 0; i < size; i++) {

            if(i == size - 1){
                System.out.print(" and " + foods[i] + ".");
            } else {
                System.out.print(", " + foods[i]);
            }

        }


        s.close();
    }

}
