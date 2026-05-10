package Bro.HangmanGameExternalFileImport;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class FileLoader {


   //This function it is fed the file path, it will read the file and return all the words and returns a linkedlist<String>
    public static LinkedList<String> list(String filePath) {

        LinkedList<String> fruits = new LinkedList<String>();

        //To run a FileReader we have to wrap it in a BufferedReader like the below
        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            //The below code essentially allows us to read the text file line by line.
            //When it runs out it returns null which breaks the while loop.
            while ((line = br.readLine()) != null) {
                fruits.add(line.trim());
            }
        } catch (
                FileNotFoundException i) {
            System.out.println("Could not locate file");
        } catch (
                IOException e) {
            System.out.println("Something went wrong");
        }

        return fruits;
    }

}
