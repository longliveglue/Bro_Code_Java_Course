package Bro.Eight;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        //USING RANDOM TO GENERATE RANDOM INTS, DOUBLES AND BOOLEANS.

        Random random = new Random();

        int number1 = random.nextInt(1,7);
        double number2 = random.nextDouble(0, 1);
        boolean number3 = random.nextBoolean();

        System.out.println(number1);
        System.out.printf("%.2f%n",number2);
        System.out.println(number3);

        if(number3 == true){
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }


    }

}
