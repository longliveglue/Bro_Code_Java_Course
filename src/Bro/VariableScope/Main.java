package Bro.VariableScope;

public class Main {

    //This is a Class variable with global reaach
    static int z = 44;

    public static void main(String[] args) {
        //Variable Scope. Where a variable can be accessed.
        //Local - If you declare a variable in a Method
        //Class a global variable assigned outside of the main() method.
        System.out.println(z);

        //This is a local variable. it is only accessible in between the curly braces where it was declared.
        int x = 1;
        String y = "This is the Local Y not the method Y";
        System.out.println(x);

        //Notice that the int variable y is contained within a method called
        System.out.println(y);

        //This is a class variable within the alternate class there is a static method which we can always call.
        alternate.returnAlt();

        // This is also a class variable but note that the class had to be instantiated.
        alternate alty = new alternate();

        // This called the method alt();
        alt();
    }

    public static void alt() {
        int y = 2;
        String x = "This is the string x not the number x";
        System.out.println(x);

        //This is accessing Z the global veriable assigned outside of the main() method.
        System.out.println(z);
    }
}
