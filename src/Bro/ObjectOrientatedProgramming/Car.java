package Bro.ObjectOrientatedProgramming;

public class Car {

    //A Car has Make, Model, Engine Size,
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isRunning = false;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void startCar(){
        if(isRunning == false){
            isRunning = true;
            System.out.println("The " + this.make +  " is now running");
        } else {
            System.out.println("The " + this.make +  " already running");
        }
    }

    public void stopCar(){
        if(isRunning == true){
            isRunning = false;
            System.out.println("The " + this.make +  " is now stopped");
        } else {
            System.out.println("The " + this.make +  " already stopped");
        }
    }

}
