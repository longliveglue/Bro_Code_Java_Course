package Bro.Inheritance;

public class Fish extends Animal {

    public Fish(boolean isAlive) {
        super(isAlive, false); // Fish are NOT mammals
    }

    public void speak() {
        System.out.println("Bloop... bloop...");
    }
}