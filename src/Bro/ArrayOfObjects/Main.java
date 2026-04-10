package Bro.ArrayOfObjects;

public class Main {

    public static void main(String[] args) {
        // By creating the Cars individually and giving them a pointer ie car1, car 2 etc they are named objects
        Car car1 = new Car("Cupra", "Born");
        Car car2 = new Car("BMW", "X3");
        Car car3 = new Car("Seat", "Leon");

        Car[] cars = {car1, car2, car3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        System.out.println();

        for (Car currentCar : cars) {
            currentCar.drive();
        }

        System.out.println();
        //These are anonymous cars as they have no pointer outside of the array.
        Car[] moreCars = {new Car("Audi", "Q3"),
                new Car("Volkswagen", "Polo")};

        for(Car moreMoreCars : moreCars){
            moreMoreCars.drive();
        }


    }

}
