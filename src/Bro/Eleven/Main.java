package Bro.Eleven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Compound interest calculator

        Scanner s = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("  Enter the principal amount: ");
        principal = s.nextDouble();

        System.out.print("\n Enter the interest Rate in %: ");
        rate = s.nextDouble() / 100;

        System.out.print("\n Enter the number of times compounded per year: ");
        timesCompounded = s.nextInt();

        System.out.print("\n Enter the number of years: ");
        years = s.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("\n The amount after %d is: $%.2f  ", years,amount);

        s.close();
    }

}
