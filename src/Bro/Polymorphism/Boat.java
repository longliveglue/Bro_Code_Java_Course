package Bro.Polymorphism;

public class Boat extends Vehicle{
    @Override
    void go(){
        System.out.println("You sail the boat");
    }

    public void dock(){
        System.out.println("You pull alongside shore.");
    }
}
