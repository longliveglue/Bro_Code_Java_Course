package Bro.Eighteen;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String day = "";
        Scanner s = new Scanner(System.in);
        System.out.print("What day is it?: ");
        boolean flag = true;

        while (flag) {
            if (s.hasNextLine()) {
                day = s.nextLine();
                switch (day) {

                    case "saturday", "sunday", "Saturday", "Sunday", "sat", "sun", "Sat", "Sun", "SATURDAY", "SUNDAY",
                         "SAT", "SUN" -> System.out.println("Its the Weekend relax!");

                    default -> System.out.println("Its a Weekday get to work.");

                }

                flag = false;
            } else {
                System.out.println("\n You didn't enter a day.");
            }
        }

    s.close();
    }

}
