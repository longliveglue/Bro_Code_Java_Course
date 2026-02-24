package Bro.Eighteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Enhanced Switches = A replacement for too many else if statments.

        Scanner s = new Scanner(System.in);
        boolean flag = true;
        String output = "";

        System.out.print("Enter your first name: ");

        while (flag) {

            if (s.hasNextLine()) {
                output = goodNameBadName(s.next());
                flag = false;
            } else {
                System.out.println("\n You didnt enter in a name");
            }

        }
        System.out.println(output);

    }

    public static String goodNameBadName(String string) {

        return switch (string) {
            case "Tom" -> "You have a good name";
            case "Laura" -> "Also a good name";
            default -> {
                yield "You have a really bad name."; // you have to use the word yield to return from a default.
            }

        };

    }


}
