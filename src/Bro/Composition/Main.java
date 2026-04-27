package Bro.Composition;

public class Main {
    public static void main(String[] args){
        //Composition = Represents a "Part-of" relationship between objects.
        //For example, an Engine is "Part of" a Car.
        //Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Tesla", 2025, "V8");

        System.out.println(car.model + " " + car.year + " " + car.engine.engineType);

        car.start();
    }

}
