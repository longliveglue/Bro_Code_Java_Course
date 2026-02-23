package Bro.Seventeen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TEMPERATURE CONVERSION APP.

        Scanner s = new Scanner(System.in);

        double temp = 0.00d;
        double newTemp;
        String unit = "";
        boolean flag = true;

        System.out.print("Welcome to Toms Temperature converter.\nEnter the temperature you wish to convert as a number only:  ");

        while (flag) {

            if (s.hasNextDouble()) {
                temp = s.nextDouble();
                s.nextLine();
                flag = false;
            } else {
                System.out.println("You didn't enter a double i.e 16.65 or 22.10 please enter a double number only.");
                s.next();
            }

        }

        flag = true;
        System.out.print("Now which temperature is it in C for celcius or F for farhenheit: ");

        while (flag) {

            if (s.hasNextLine()) {
                unit = s.nextLine();

                if (!unit.isEmpty()) {
                    unit = unit.toUpperCase();
                    unit = unit.substring(0, 1);
                    if (unit.contains("C") || unit.contains("F")) {
                        flag = false;
                    } else {
                        System.out.print("\nYou didn't enter a C or a F:");

                    }

                }

            }

        }

        //I know this line is hell on eath but i wanted to see if it was possible.
        System.out.printf("\n%.2f°%S converted to %s is %.2f°%S",temp,unit, (unit.contains("C"))? "Fahrenheit ":"Celsius", (unit.contains("C"))? (temp * 1.8) + 32 : (temp - 32) / 1.8, (unit.contains("C"))? "F ":"C ");



        s.close();
}


}
