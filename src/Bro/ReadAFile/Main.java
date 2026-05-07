package Bro.ReadAFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        //How to read a file using Java (3 Popular options)
        //BufferedReader + FileReader: Best for reading text files line-by-line
        //FileInputStream: Best for binary files (e.g, images, audio files)
        //RandomAccessFile: Best for read/write specific portions of a large file.


        //As usual we want the file path to be a string so that we can always update it
        String filePath = "/Users/thomashamilton/Desktop/Desktop - Thomas’s Mac mini - 1/Java Write/test2.txt";

        //To run a FileReader we have to wrap it in a BufferedReader like the below
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
           String line;
           //The below code essentially allows us to read the text file line by line.
            //When it runs out it returns null which breaks the while loop.
           while((line = br.readLine()) != null){
               System.out.println(line);
           }
        }
        catch (FileNotFoundException i){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }

        
        System.out.println("File was found");



    }
}
