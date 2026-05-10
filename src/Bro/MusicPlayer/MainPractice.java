package Bro.MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainPractice {
    public static void main(String[] args) {

        String filePath = "src/Glass_Shoreline.wav";
        File file = new File(filePath);

        boolean isPlaying = true;
        Clip clip = null;


        //Use the try with resources, Scanner because when the try ends it will close the Scanner so we don't have to use s.close.
        //To use Audio InputStream you have to use the try method because its considered dangerous code.
        //Notice that we are calling the AudioInputSteam = but are not using new. Not sure why.
        try (Scanner s = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            //1. Setup the clip. Notice clip = AudioSystem.getClip() interesting.
            clip = AudioSystem.getClip();
            //I don't really understand this bit. Seems like we are loading the clip twice?
            clip.open(audioStream);

            //2 Start playback immediately.
            clip.start();
            System.out.printf("Song %s now playing.", filePath.substring(4, filePath.length() - 4));

            //Now we need a while loop otherwise as soon as the song starts playing it will stop becasue it will not wait for the song to end.

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
                    // We need to store the current position that the song is at. When we call clip.start() unless you have previously set the frame it will always revert to 0.
                    int currentPosition = clip.getFramePosition();
                    clip.setFramePosition(currentPosition);
                    clip.start();
                    System.out.println("--- Continuing ---");
                } else {
                    // Handle invalid input gracefully
                    System.out.println("Invalid command. Use Q, P, or C.");
                }

            }

        } catch (IOException e) {
            System.out.println("There was an Error");
        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            throw new RuntimeException(e);
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