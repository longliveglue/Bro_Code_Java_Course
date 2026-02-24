package Bro.Eighteen;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String day = "";
        String shortDay;
        Scanner s = new Scanner(System.in);
        System.out.print("What day is it?: ");
        boolean flag = true;

        while (flag) {
            if (s.hasNextLine()) {
                day = s.nextLine();

                shortDay = day.substring(0, 3);

                shortDay = shortDay.toUpperCase();


                switch (shortDay) {

                    case "SAT", "SUN" -> {
                        System.out.println("Its the Weekend relax!");
                        flag = false;
                    }
                    case "MON", "TUE", "WED", "THU", "FRI" -> {
                        System.out.println("Its a Weekday get to work.");
                        flag = false;
                    }
                    default -> System.out.println(day + " isn't a day try again.");
                }


            }
        }

        s.close();
    }

}
