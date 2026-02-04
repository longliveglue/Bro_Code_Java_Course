package Bro.Three;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your Age: ");
        int age = s.nextInt();

        System.out.println("What height are you in metres and cm i.e 1.78: ");
        double height = s.nextDouble();

        int metres = 0;
        int cm = 0;

        metres = (int) height;
        height = (height * 100) - metres * 100;
        cm = (int) height;


        System.out.println("Hey " + name + " you are " + age + " years old and your " + (metres > 1? metres  + "metres" : metres + " metre")  + " and " + cm + "cm tall");

        s.close();


    }

}
