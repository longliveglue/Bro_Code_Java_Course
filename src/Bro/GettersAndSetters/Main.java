package Bro.GettersAndSetters;

public class Main {
    // They protect object data and add rules for accessing or modifying them.
    // Getters = Methods that a field Readable.
    // Setters = Methods that make a field Writeable.

    public static void main(String[] args) {
        Car car = new Car("BMW", "Black", 1000);

        car.setModel("Seat");
        car.setColour("White");
        car.setPrice(500);
        System.out.println(car.getModel() + " " + car.getColour() + " £" + car.getPrice());

    }


}
