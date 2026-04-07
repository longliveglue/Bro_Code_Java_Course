package Bro.ObjectOrientatedProgramming;

public class Main {
    public static void main(String[] args) {

        // Object = An entity that holds data (attributes).
        //          And can perform actions (Methods).
        //          It is a reference data type.

        Car car = new Car("Cupra", "Born", 2024, 26000);

        System.out.printf("£%.2f\n", car.getPrice());

        car.setPrice(25000);

        System.out.printf("£%.2f\n", car.getPrice());

        car.startCar();
        car.startCar();
        car.stopCar();
        car.stopCar();

    }
}
