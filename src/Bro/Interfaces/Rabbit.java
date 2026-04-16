package Bro.Interfaces;

public class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println(this.getClass().getSimpleName() + " Ran away!");
    }
}
