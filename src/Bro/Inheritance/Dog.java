package Bro.Inheritance;

public class Dog extends Animal {

    public Dog(boolean isAlive) {
        super(isAlive, true); // Dogs are always mammals
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}