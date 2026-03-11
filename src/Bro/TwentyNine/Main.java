package Bro.TwentyNine;

import java.util.Scanner;

public class Main {

    //DECLARE GLOBAL CLASS VARIABLE THAT CAN BE ACCESSED BY ALL METHODS
    static double bankAccount = 0.00;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;


        //CREATE A WHILE LOOP THAT OFFERS US A MENU UNLESS WE PRESS 4 OR A BUTTON THAT IS NOT 1-3
        while (flag) {
            System.out.println();
            System.out.println("****************");

            System.out.println("BANKING PROGRAM");

            System.out.println("****************");
            System.out.println();
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            //A SWITCH THAT WILL TAKE THE USERS INPUT AND CALL ONE OF THE THREE METHODS.
            switch (s.nextInt()) {
                case 1 -> getBalance();
                case 2 -> deposit(s);
                case 3 -> withdraw(s);
                default -> {
                    flag = false;
                }
            }
        }
        s.close();

    }

    //IF A USER SELECTS SHOW DEPOSIT IT CALLS THE getBalance() method.
    public static void getBalance() {
        System.out.printf("You have $%.2f in your bank account.\n", bankAccount);
    }

    //IF A USER ADDS MONEY IT WILL ADD THE DEPOSIT.
    public static void deposit(Scanner s) {
        System.out.print("How much do you wish to deposit?: ");
        double deposit = s.nextDouble();

        if(deposit < 0){
            System.out.println();
            System.out.println("You cannot deposit negative amounts!");
            return;
        } else {
            bankAccount += deposit;
        }

        System.out.println();
        System.out.println("****************");
        System.out.printf("You now have $%.2f in your bank account. \n", bankAccount);
        System.out.println("****************");
        System.out.println();

    }

    public static void withdraw(Scanner s) {
        System.out.print("How much do you wish to withdraw?: ");
        double withdraw = s.nextDouble();

        if(withdraw > bankAccount){
            System.out.println("Unfortunately you don't have sufficient funds.");
            return;
        } else if(withdraw < 0) {
            System.out.println();
            System.out.printf("Please enter a number between 0 and %.2f \n", bankAccount);
            System.out.println();
            return;
        } else{
            bankAccount -= withdraw;
        }

        System.out.println();
        System.out.println("****************");
        System.out.printf("You now have $%.2f in your bank account. \n", bankAccount);
        System.out.println("****************");
        System.out.println();
    }

}
