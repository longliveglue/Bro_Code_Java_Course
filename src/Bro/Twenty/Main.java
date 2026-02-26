package Bro.Twenty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Logical Operators.

        //&& = AND
        //|| = OR
        //! = NOT

        double temp = -10;
        boolean isSunny = true;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");

        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad");
        }


        // Data integrity check.

        Scanner s = new Scanner(System.in);
        //Username must be between 4-12 characters.
        //Username must not contain spaces or underscores.

        String username;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter a username without spaces, underscores and it must be between 4 - 12 characters long: ");
            if(s.hasNextLine()) {
                username = s.nextLine();
                if (!username.isEmpty() && !username.contains(" ") && !username.contains("_") && !(username.length() < 4) && !(username.length() > 11)){
                    System.out.println("Your username is good");
                    flag = false;
                }
            } else {
                System.out.println("You didn't enter a username");
                s.next();
            }
        }


        s.close();
    }
}
