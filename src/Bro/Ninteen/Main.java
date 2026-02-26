package Bro.Ninteen;

import java.util.Scanner;

public class Main {
    //Build a calculator

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        String operator = "";
        boolean flag = true;
        double sum = 0;


        while (flag) {
            System.out.print("Enter in the First number: ");
            if (s.hasNextDouble()) {
                number1 = s.nextDouble();
                s.nextLine();
                flag = false;
            } else {
                System.out.println("\nYou didn't enter a double");
                s.next(); // clears the old answer.
            }

        }

        flag = true;

        while (flag) {
            System.out.print("Enter in the your operator * / + -: ");
            if (s.hasNextLine()) {
                operator = s.nextLine();

                switch (operator) {
                    case "/" -> {
                        System.out.println("Divide");
                        flag = false;
                    }
                    case "*" -> {
                        System.out.println("Multiply");
                        flag = false;
                    }
                    case "+" -> {
                        System.out.println("Plus");
                        flag = false;
                    }
                    case "-" -> {
                        System.out.println("Minus");
                        flag = false;
                    }
                    default -> System.out.println("You didn't choose a + - / or * operator");
                }

            }

        }

        flag = true;

        while (flag) {
            System.out.print("Enter in the Second number: ");
            if (s.hasNextDouble()) {
                number2 = s.nextDouble();
                flag = false;
            } else {
                System.out.println("\nYou didn't enter a double");
                s.next(); // clears the old answer.
            }

        }

        switch (operator) {
            case "/" -> {
                sum = number1 / number2;
                System.out.printf(" %.2f / %.2f = %.2f", number1, number2, sum);
                flag = false;
            }
            case "*" -> {
                sum = number1 * number2;
                System.out.printf(" %.2f * %.2f = %.2f", number1, number2, sum);
                flag = false;
            }
            case "+" -> {
                sum = number1 + number2;
                System.out.printf(" %.2f + %.2f = %.2f", number1, number2, sum);
                flag = false;
            }
            case "-" -> {
                sum = number1 - number2;
                System.out.printf(" %.2f - %.2f = %.2f", number1, number2, sum);
                flag = false;
            }
            default -> System.out.println("You didn't choose a + - / or * operator");
        }

        s.close();
    }

}
