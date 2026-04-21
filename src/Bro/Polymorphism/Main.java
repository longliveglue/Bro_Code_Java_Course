package Bro.Polymorphism;

public class Main {
    // Polymorphism = Poly = Many
    //                Morph = Shape
    //                Objects can identify as other objects.
    //                Objects can be treated as objects of a common superclass


    // We can achieve this using Abstract classes and super classes.
    // We can also achieve it using interfaces like the Animal interface

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();


        car.go();
        bike.go();
        boat.go();

        System.out.println();
        // The below array of cars won't work because bikes and boats aren't cars.
        //Car[] cars = {car, bike, boat}

        Vehicle[] vehicles = {car, bike, boat};
        // The above works

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        System.out.println();


        //Animal is an interface
        Cat cat = new Cat();
        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();

        Animal[] animals = {cat, dog, rabbit};

        for (Animal animal : animals) {
            animal.moves();
        }

    }

}
