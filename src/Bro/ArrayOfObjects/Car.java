package Bro.ArrayOfObjects;

public class Car {

    String make;
    String model;

    public Car(String make, String model){
        this.model = model;
        this.make = make;
    }

    public void drive(){
        System.out.printf("You drive a %s %s \n",make,model);
    }

}
