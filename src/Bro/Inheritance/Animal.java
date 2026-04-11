package Bro.Inheritance;

public class Animal extends Organism {

    public boolean isMammal;

    public Animal(boolean isAlive, boolean isMammal) {
        super(isAlive); // Sends 'isAlive' up to Organism
        this.isMammal = isMammal;
    }

    public void animalAbout() {
        if (isAlive) {
            System.out.println("Moving about...");
        }
    }

    public void eat() {
        // Automatically gets the name of the subclass (Dog, Fish, etc.)
        System.out.println("The " + this.getClass().getSimpleName() + " is eating.");
    }
}