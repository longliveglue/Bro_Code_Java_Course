package Bro.Ten;

public class Main {

    public static void main(String[] args) {
        //WE WILL NOW COVER PRINTF.
        // %[Flags][Width][.precision][specified-character]

        // The escape Character is always %

        //For a string its %s for string.
        String name = "Spongebob";

        //For a char it is %c for character
        char firstLetter = name.charAt(0);

        //For a int it is %d for decimal
        int age = 30;

        // doubles are %f and we can use %.2f to give 2 decimal places or %.9f for 9 decminal places
        double height = 60.5;

        // Boolean is %b for boolean.
        boolean real = false;


        System.out.printf("His name is %s. \n", name);
        System.out.printf("The first letter of his name is %c. \n", firstLetter);
        System.out.printf("He is %d years old. \n", age);
        System.out.printf("He is %.2fcm tall.", height);
        System.out.printf("Its %b that he is employed.\n", real);


        System.out.printf("%s works at the CrustyCrab. He is %d years old and is %.2f tall also his first inital is %c. This is all %b. But its fun to imagine.\n", name, age, height, firstLetter, real);

        System.out.println();
        //[Flags]
        //+ = output a plus if it is a positive number.
        //, = large numbers are broken up by , 1000 = 1,000.
        // ( = negative numbers are enclosed in a ()
        // space = displayed a minus if negative, space if positive.

        //+ = output a plus if it is a positive number.
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        System.out.println("Below demonstrates what the + flag does so %+.2f. As you will see below if the number is a positive it will add a + in front of it. - numbers won't be affected and they always have a - preceding them.");
        System.out.printf("price 1 = %+.2f\n", price1);
        System.out.printf("price 2 = %+.2f\n", price2);
        System.out.printf("price 3 = %+.2f\n", price3);

        //, = large numbers are broken up by , 1000 = 1,000.
        price1 = 900000.99;
        price2 = 1000000.15;
        price3 = -540000.01;

        System.out.println("Below demonstrates what the , flag does so %,.2f. As you will see below if the number is large like 1000 it will break it into groupings using the , 1,000 etc");
        System.out.printf("price 1 = %+,.2f\n", price1);
        System.out.printf("price 2 = %+,.2f\n", price2);
        System.out.printf("price 3 = %,.2f\n", price3);

        // ( = negative numbers are enclosed in a ()
        price1 = 900000.99;
        price2 = 1000000.15;
        price3 = -540000.01;

        System.out.println("Below demonstrates what the , flag does so %(.2f. As you will see below will wrap the -540000.01 in brackets");
        System.out.printf("price 1 = %+(.2f\n", price1);
        System.out.printf("price 2 = %+(,.2f\n", price2);
        System.out.printf("price 3 = %,(.2f\n", price3);

        // space = displayed a minus if negative, space if positive.
        System.out.println("Below demonstrates what the  [space] flag does so % .2f. This will make all positive numbers indent by one space.");
        System.out.printf("price 1 = %+(.2f\n", price1);
        System.out.printf("price 2 = %+(,.2f\n", price2);
        System.out.printf("price 3 = %,(.2f\n", price3);

        //Width flag

        // 0 = zero padding.
        // number = right justified padding.
        // negative number = left justified.

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //0 indicated we want to add padding and the next number states by how much.

        //You can see that three 0's are added in front of the 1
        System.out.printf("%04d \n", id1);
        System.out.printf("%04d \n", id2);
        System.out.printf("%04d \n", id3);

        //You can see that no 0'd are added in front of the 7890 that's because we wrote 04 so the number is already 4 wide.
        System.out.printf("%04d \n", id4);

        //we can also just type a number to indicate padding without 0s
        //You can see that three 0's are added in front of the 1
        System.out.printf("%4d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%4d \n", id3);

        //You can see that no 0'd are added in front of the 7890 that's because we wrote 04 so the number is already 4 wide.
        System.out.printf("%4d \n", id4);

        //We can also just type a number to indicate padding to the left
        //You can see that three 0's are added in front of the 1
        System.out.printf("%-4d \n", id1);
        System.out.printf("%-4d \n", id2);
        System.out.printf("%-4d \n", id3);

        //You can see that no 0'd are added in front of the 7890 that's because we wrote 04 so the number is already 4 wide.
        System.out.printf("%-4d \n", id4);


    }

}
