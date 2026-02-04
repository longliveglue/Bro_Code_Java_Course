package Bro.Two;

public class Main {
    static void main(String[] args) {
        //1. Declaration of a variable.
        int age;

        //2 Initialisation
        age = 21;
        int myAge = age;
        age = age - 2;

        System.out.println(age);
        System.out.println(myAge);

        System.out.println("My age is " + myAge + " but you are " + age);

        double carPrice = 20045.99;

        System.out.println("The car costs " + "$" + carPrice);

        String name = "Thomas";
        String newName = name;

        name = name + " Hamilton";

        System.out.println(name);

        Boolean forSale = true;
        char currency = '$';

        if(forSale){
            System.out.println("The car has been sold for " + currency + carPrice);
        }


    }
}
