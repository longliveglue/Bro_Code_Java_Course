package Bro.TwentySeven;

public class Main {
    //OVERLOADED METHODS
    //Methods can share the same name.
    //Overloaded methods have different paramters.
    //signature = name + parameters.

    public static void main(String[] args) {

        System.out.println(add(2.00, 3.00));
        System.out.println(pizza("Sour Dough", "tomato"));
        System.out.println(pizza("Sour Dough", "tomato", "Cheese"));

    }

    public static double add(double a, double b) {

        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static String pizza(String dough, String topping1) {
        return dough + " " + topping1;
    }

    public static String pizza(String dough, String topping1, String topping2) {
        return dough + " " + topping1 + " " + topping2;
    }

}
