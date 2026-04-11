package Bro.Inheritance;

public class Organism {

    protected boolean isAlive; // Use 'protected' so subclasses can see it

    public Organism(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean amIAlive() {
        return isAlive;
    }
}