package Bro.WritingToFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        //How to write to a file using Java (4 Popular Options)
        // FileWrite = Good for small or medium sized text files.
        //BufferedWriter = Better performance for large amounts of text.
        //PrintWriter = Best for stuctured data, like reports of logs.
        //FileOutputStream = Best for binary files (e.g, images, audio files)

        //It is best practice to have the file path as a string.
        String filePath = "/Users/thomashamilton/Desktop/Desktop - Thomas’s Mac mini - 1/Java Write/";
        String textContent = """
                Roses are red Violets are blue
                So are my balls
                i want you!
                """;

        //When using FileWriter we have to have a try(FileWriter fw = new FileWriter("test.txt"){} and a catch with the exception IOException
        try( FileWriter fw = new FileWriter(filePath + "test2.txt");){
            fw.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not write file due to not find file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}
