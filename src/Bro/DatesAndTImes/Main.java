package Bro.DatesAndTImes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        //How to work with Dates and Times using Java.
        //(Localdate, LocalTime, LocalDateTime, UTC timestamp).


        //Create an object called date. Then looking into the LocalDate class there is a static method we can call to get the current date.
        LocalDate date = LocalDate.now();

        //We then can print out date.
        System.out.println(date);

        // If we want to print out the current time we can do that but its a little bit more complicated.
        LocalTime time = LocalTime.now();

        //Once we have a LocalTime of time. We get the time but with nanoseconds after seconds.
        //In order to cut off the nano seconds we need to use a formater. DateTimeFormater.
        //Using the ofPattern allows us to set the HH (Hours) mm Minutes etc
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // The Formatter is simply a template. We now need to make a string. That takes the time and formats it using the formatter.
        String newTimeFormatted = time.format(formatter);
        System.out.println(newTimeFormatted);

        // We can also get the date and the time. Which is the same as before we will need a formatter etc.
        LocalDateTime localDateTime = LocalDateTime.now();

        //Formatter as before.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String newDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println(newDateTime);


        //If we wanted to create a comparison for an alarm clock etc then you will need the current time and then the time you want
        // to compare against.

        //For this i am creating to sets of time.
        LocalTime time1 = LocalTime.of(14, 30, 00);
        LocalTime time2 = LocalTime.of(14, 30, 00);

        //Then i run an if statement to compare the times and execute some code.
        if (time1.isBefore(time2)) {
            System.out.println(time1 + " is before " + time2);
        } else if (time2.isBefore(time1)) {
            System.out.println(time2 + " is before " + time1);
        } else {
            System.out.println(time1 + " and " + time2 + " are the same time");
        }


    }
}
