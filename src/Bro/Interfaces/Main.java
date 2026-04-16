package Bro.Interfaces;

public class Main {
    // Interface = A blueprint for a class that specifies a set of abstract methods.
    // that implementing classes MUST define.
    // Supports multiple inheritance-like behaviour


    public static  void main (String[] args){

        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();

        rabbit.flee();

        fish.flee();
        fish.hunt();
        fish.eat();
    }

}
