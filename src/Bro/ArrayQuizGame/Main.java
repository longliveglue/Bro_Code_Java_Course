package Bro.ArrayQuizGame;

import java.util.Scanner;

//This will be a quiz game using Scanner and 2D arrays.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = 0;

        //Set the questions
        String[] questions = {"What is the main function of a router?",
                "Which part of the computer is considered the Brain?",
                "What year was Facebook launched?",
                "Who is know as the father of the Computer?",
                "What was the first programming Language?"};

        // Set the Answers
        String[][] options = {{"1. Storing Files", "2. Encrypting data", "3. Directing Internet Traffic", "4. Managing passwords"},
                {"1. The GPU", "2. The RAM", "3. The Motherboard", "4. The CPU"},
                {"1. 2001", "2. 2005", "3. 2034", "4. 1964"},
                {"1. Bill Gates", "2. Steve Wozniach", "3. Steve Jobs", "4. Alan Turing"},
                {"1. FORTRAN", "2. PASCAL", "3. C", "4. Java"}};

        //Set the correct response to the answers as they are in the array.
        //Even though there is no answe 0 i want to keep it simple.
        int[] answers = {2, 3, 0, 3, 0};

        System.out.println("""
                
                ##############################################################
                #       Welcome to the computer knowledge Quiz game!         #
                #       Read the question and then answer the question       #
                #       Reply with either 1, 2, 3 or 4 dependng on the       #
                #       Correct Answer.                                      #
                ##############################################################
                """);


        //Cycle through the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println();

            //Cycle through the possible answers
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.println();

            //After each question allow the user to give an answer
            System.out.print("What is the correct answer 1-4?: ");
            System.out.println();
            int userAnswer;
            boolean flag = true;
            while (flag) {


                //Check to see if the user has indeed entered an int
                if (s.hasNextInt()) {
                    userAnswer = s.nextInt();

                    //Check to make sure the int is between 1 and 4
                    if (userAnswer > 0 && userAnswer < 5) {
                        //Check to see if the answer they have picked is actually the correct answer.
                        if (userAnswer - 1 == answers[i]) {
                            score++;
                            System.out.printf("""
                                    ##############################################
                                    # Thats the correct Answer you Score a point #
                                    # You have %d Points Total.                   #
                                    ##############################################
                                    """, score);

                        } else {
                            System.out.println("Sorry the correct answer was");
                            System.out.println(options[i][answers[i]]);

                        }
                        flag = false;
                        System.out.println();
                        System.out.println();

                    } else {
                        System.out.print("You must enter a number between 1 and 4 only: ");
                    }


                } else {
                    System.out.print("You must enter a number not a letter between 1 - 4 : ");
                    s.next();
                }
            }


        }

        System.out.println("You scored " + score + " points.");

        s.close();
    }
}
