package Bro.ToStringOverride;

public class Car {

    String make;
    String model;
    int year;
    String colour;

    public Car(String make, String model, int year, String colour) {
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString() {

        return make + " " + model + " " + year + " colour " + colour;
    }

}
