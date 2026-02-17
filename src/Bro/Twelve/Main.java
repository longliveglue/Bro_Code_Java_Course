package Bro.Twelve;

public class Main {
    public static void main(String[] args) {

        //NESTED IF STATMENTS.

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {

            if (isSenior) {
                System.out.println("You are a student and a senior you get a 20% discount");
                System.out.printf("You Pay $%.2f", price / 100 * 80);
            } else {
                System.out.println("You are a student you get a 10% discount");
                System.out.printf("You Pay $%.2f", price / 100 * 90);
            }

        } else {
            if(isSenior){
                System.out.println("You are a senior you get a 10% discount.");
                System.out.printf("You Pay $%.2f", price / 100 * 90);
            } else {
                System.out.println("You Pay $" + price);
            }
        }

    }

}
