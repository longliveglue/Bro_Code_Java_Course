package Bro.Fourteen;

import java.util.Scanner;

public class Main {

    //SUBSTRINGS
    //.substring() = A method used to extract a portion of a string.
    // e.g name.substring(int Starting index, int end index)

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String name = "";
        String firstName;
        String surname;

        while(name.isEmpty()) {

            while(!name.contains(" ")) {
                System.out.print("What is your First and Last name?: ");
                name = s.nextLine();
            }

        }


        int endOfFirstName = name.indexOf(" ");
        firstName = name.substring(0, endOfFirstName);
        surname = name.substring(endOfFirstName + 1, name.length());

        System.out.println("\nSo your first name is " +  firstName);
        System.out.println("and your surname is " + surname);

        System.out.print("What is your email address?: ");

        String email = s.nextLine();
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+ 1, email.lastIndexOf("."));

        System.out.println("\nSo that means your username will be " +username);
        System.out.println("Your domain name is " + domain + ".com ");




    }
}
