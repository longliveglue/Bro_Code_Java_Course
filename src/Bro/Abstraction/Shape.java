package Bro.Abstraction;

public abstract class Shape {

    abstract double area(); // abstract method


    // Concrete method.
    public void display(){
        System.out.println("This "+  getClass().getSimpleName() + " is a shape from a concrete method"  );
    }

}
