package Bro.HangmanGameExternalFileImport;

import java.util.Random;

public class RemoveChars {

    public static String removeChars(String fruit) {
        int numberOfLettersToRemove = (int) Math.floor(fruit.length() / 3.0);
        Random random = new Random();


        StringBuilder obfuscated = new StringBuilder();

        for (int i = 0; i < fruit.length(); i++) {
            // Check if we still need to remove letters AND if the random "coin flip" hits
            if (numberOfLettersToRemove > 0 && random.nextInt(2) == 1) {
                obfuscated.append("-");
                numberOfLettersToRemove--;
            } else {
                obfuscated.append(fruit.charAt(i));
            }
        }

        return obfuscated.toString();
    }

}
