package Bro.Thirteen;

public class Main {

    public static void main(String[] args) {
        //STRING METHODS.

        String name = "  Thomas Hamilton ";
        int length = name.length(); // Gives the length of a String.
        char letter = name.charAt(2); //Gives the character at a point in the string. 0 is the first T 1 is h etc.
        int index = name.indexOf("H"); // This will search the string and return the index position of the character.
        int lastIndex = name.lastIndexOf("o"); //Return the last index of the last time the o appears.


        System.out.println(name + " is " + length + " characters long");
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

        name = name.toUpperCase(); //Takes a string and converts it to uppercase.
        System.out.println(name);

        name = name.toLowerCase(); //Takes a string and converts it to lowercase.
        System.out.println(name);

        name = name.trim(); // trim removes all white space from the string front and end but leaves any gaps inbetween words .
        System.out.println(name);

        name = name.replaceFirst("t", "T"); // Only replaces the first character it finds. t to T.
        name = name.replace("h", "H"); // Replaces all characters from h to H

        System.out.println(name);

        System.out.println(name.isEmpty()); // name.isEmpty() checks if a string is empty if it is it will return true and if it's not empty it will return true.

        if (name.contains("TH")) { //contains will check for a character or a series of characters
            System.out.println("Your name contains TH.");
        }

        //if we want to check to strings against each other we have to use the .equals() method not the ==. It cares for case

        if(name.equals("password")){
            System.out.println("Welcome to your account your password matched");
        } else{
            System.out.println("Your password doesn't match");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Welcome to your account your password matched");
        } else{
            System.out.println("Your password doesn't match");
        }

    }



}
