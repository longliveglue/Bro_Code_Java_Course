package Bro.HangmanGameExternalFileImport;

import java.util.LinkedList;
import java.util.Random;

public class RandomItem {


    public static String randomItem(LinkedList<String> fruits) {
        Random random = new Random();
        int fruitToPick = random.nextInt(0, fruits.size());
        return fruits.get(fruitToPick);
    }

}
