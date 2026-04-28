package Bro.Wrapper;

public class Main {
    // Wrapper Classes = Allows Primitive values (int, char, double, boolean)
    // to be used as objects. "Wrap them in an Object"/
    // Generally don't wrap primitives unless you need an Object.
    // Allows use of Collections Framework and static Utility Methods.


    public static void main(String[] args) {

        /*
        // Old way
        Integer a =  new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true);

        //New way = Auto boxing
        Integer e = 123;
        Double f = 3.14;
        Character g = '$';
        Boolean h = true;
        String i = "Pizza"; // Not an Wrapped but similar.

        //Unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean u = d;

        // Uses of the wrapper class
        */

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('$');
        String d = Boolean.toString(true);

        String x = a + b + c + d;
        System.out.println(x);

        char letter = 'b';
        System.out.println(Character.isAlphabetic(letter));
        System.out.println(Character.compare(letter, 'c'));


    }


}
