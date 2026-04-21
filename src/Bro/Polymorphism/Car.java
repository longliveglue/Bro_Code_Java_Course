package Bro.Polymorphism;

public class Car extends Vehicle{
    @Override
    void go(){
        System.out.println("You drive the car");
    }

    public void honk(){
        System.out.println("You honk the horn");
    }

}
