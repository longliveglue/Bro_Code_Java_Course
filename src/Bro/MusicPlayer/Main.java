package Bro.MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Define the path to the audio file. Ensure this path is correct relative to where you run the program.
        String filePath = "src/Glass_Shoreline.wav";
        File file = new File(filePath);

        // Flag to control the main loop execution.
        boolean isPlaying = true;
        Clip clip = null; // Declare clip outside try block so it can be accessed in finally

        try (Scanner s = new Scanner(System.in);
             // Attempt to get the audio stream from the file. This is the source of the sound data.
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            // 1. Setup the Clip
            clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Start playback immediately upon successful setup
            clip.start();
            System.out.println("--- Music Player Started ---");
            System.out.println("Playing: " + file.getName());

            // Main control loop
            while (isPlaying) {
                System.out.print("\nPress Q to quit, P to Pause, C to Continue Playing:");
                String userInput = s.nextLine().trim(); // Trim whitespace from input

                if (userInput.equalsIgnoreCase("q")) {
                    // Stop playback and exit the loop
                    clip.stop();
                    isPlaying = false;

                } else if (userInput.equalsIgnoreCase("p")) {
                    // Pause: Stop the clip playback
                    clip.stop();
                    System.out.println("--- Paused ---");

                } else if (userInput.equalsIgnoreCase("c")) {
                    // Continue: Resume playback from the current position
                    // IMPORTANT FIX: We must set the frame position before starting to resume correctly.
                    long currentFrame = clip.getFramePosition();
                    clip.setFramePosition((int) currentFrame); // Cast to int as required by setFramePosition
                    clip.start();
                    System.out.println("--- Resumed ---");

                } else {
                    // Handle invalid input gracefully
                    System.out.println("Invalid command. Use Q, P, or C.");
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("\n[ERROR] File Not found at path: " + filePath);
        } catch (IOException e) {
            System.err.println("\n[ERROR] An I/O error occurred while reading the file: " + e.getMessage());
        } catch (UnsupportedAudioFileException e) {
            System.err.println("\n[ERROR] Audio File is not supported by this system/library.");
            e.printStackTrace(); // Print stack trace for debugging unsupported formats
        } catch (LineUnavailableException e) {
            System.err.println("\n[ERROR] Unable to access the required Audio Line/Resource.");
            e.printStackTrace(); // Print stack trace for debugging hardware issues
        } finally {
            // 3. Cleanup: Ensure the clip is closed to release system resources, regardless of how the loop exited.
            if (clip != null && clip.isOpen()) {
                clip.stop(); // Ensure it's stopped before closing
                clip.close();
                System.out.println("\n--- Player Closed Successfully ---");
            }
        }
    }
}
