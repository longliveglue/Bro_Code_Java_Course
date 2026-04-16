package Bro.Interfaces;

public interface Predator {

    public void hunt();

    public default void eat(){
        System.out.println("Eating");
    }

}
