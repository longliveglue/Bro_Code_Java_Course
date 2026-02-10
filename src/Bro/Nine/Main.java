package Bro.Nine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LEANRING THE MATH CLASS

        // This allows you to call Pi exactly without having to make an double variable.
        System.out.println("Math.PI = " + Math.PI);

        //This allows you to call expotential constant Yulers number
        System.out.println("Math.E = " + Math.E);

        double result;

        // Math.pow allows you to multiply numbers to a power. i.e 2 to the power of 3 = 2 x 2 = 4 x 2 = 8 (2 x 2 x 2 = 8)
        result = Math.pow(2, 3);
        System.out.println("Math.pow(2,3) = " + result);

        //Math.abs If you need the postitve version of a negative number i.e -30 becomes 30.
        result = Math.abs(-30);
        System.out.println("Math.abs(-30) = " + result);

        //Math.sqrt() this find the squareroot of the argument passed in either a number or a variable containing a number.
        result = Math.sqrt(12);
        System.out.println("Math.sqrt(12) = " + result);

        //Math.round rounds the number to its nearest whole number i.e 3.49 = 3 but 3.5 = 4.
        result = Math.round(3.49);
        System.out.println("Math.round(3.49) = " + result);

        //Math.ceil this always rounds a number up so 3.01 = 4
        result = Math.ceil(3.01);
        System.out.println("Math.ceil(3.01) = " + result);

        //Math.floor this always rounds a number down so 3.99 = 3
        result = Math.floor(3.99);
        System.out.println("Math.floor(3.99) = " + result);

        //Math.max this tells you what the bigger number is of the two variables.
        result = Math.max(10, 29);
        System.out.println("Math.max(10, 29) = " + result);

        //Math.min this tells you what the smaller number is of the two variables.
        result = Math.min(5, 29);
        System.out.println("Math.min(5, 29) = " + result);

        System.out.println();

        // TO CALCULATE THE HYPOTENUSE. c = Math.sqrt(a2 + b2)

        double a;
        double b;
        double c;

        Scanner s = new Scanner(System.in);
        System.out.println("This program find the Hypotenuse!");
        System.out.print("Please Enter side a: ");
        a = s.nextDouble();
        System.out.print("Please enter side b: ");
        b = s.nextDouble();

        c = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
        System.out.println("Hypotenuse side C = " + c + " cm");

        //Calculate the circumference of a circle = 2 * Math.PI * Radius

        s.reset();
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("This program calculates the circumference of a circle please enter the radius.");
        radius = s.nextDouble();
        circumference = 2 * Math.PI * radius;
        System.out.printf("The cirumference of a circle with the radius %.2fcm is %.2fcm ", radius, circumference);

        //Area of a circle = Math.PI * Math.pow(Radius ,2)

        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("\nThe area of a circle with a radius of %.2fcm is %.2fcm2", radius, area);


        //Volume of a cylinder = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("\nThe volume of the sphere with a radius of %.2fcm is %.2fcm3", radius, volume);

        s.close();

    }

}
