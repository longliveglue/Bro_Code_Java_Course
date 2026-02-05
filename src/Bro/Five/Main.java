package Bro.Five;

public class Main {

    public static void main(String[] args){

        int x = 10;
        int y = 3;
        int z;

        // The addition Operator is +
        z = x + y;
        System.out.println(z);

        // The subtraction Operator is -
        z = x - y;
        System.out.println(z);

        // The multiplication operator is *
        z = x * y;
        System.out.println(z);

        // The division operator is /
        z = x / y;
        System.out.println(z);

        //The modulo operator which gives you the remainder in a division is %.
        z = x % y;
        System.out.println(z);

        // If we only want to work with 2 number variables we can do things like the below.

        x = x + y;
        // or the shorter versions
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;

        // The same with subtraction, division etc.
        // We can also increment or decrement integers.

        x++;
        //This will increment x by 1;
        x--;
        //This will decrement x by 1;

        // Order of mathematic calulations = P-E-M-D-A-S - Please excuse my dope ass swag.

       /*
        P - Parethesis.
        E - Exponents.
        M - Multiplications.
        D - Division
        A - Addition
        S - Subtraction.

        For example.
       */

        double result = 3 + 4 * (7 - 5) / 2.0;
        //the resut of this will be 7.0.
        // 7-5 = 2
        //4 * 2 = 8
        // 8 / 2 = 4
        // 3 + 4 = 7.0 (double)

        System.out.println(result);








    }

}
