package Bro.Interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println(this.getClass().getSimpleName() + " Swam away!");
    }

    @Override
    public void hunt() {
        System.out.println(this.getClass().getSimpleName() + " On the hunt!");
    }
}
