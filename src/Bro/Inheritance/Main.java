package Bro.Inheritance;

public class Main {

    //Inheritance = One class inherits the attributes and methods
    //              From another class.
    //              Child <- Parent <- GrandParent
    public static void main(String[] args){

        Fish fishy = new Fish(true);
        Dog doggy = new Dog(true);

        fishy.animalAbout();

        System.out.println(fishy.getClass().getSimpleName());

        fishy.eat();

        doggy.bark();

        System.out.println(fishy.amIAlive());

        Rose rose = new Rose(true, true);

        System.out.println(rose.amIAlive());
        System.out.println(rose.inBloom);
    }
}
