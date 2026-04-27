package Bro.Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    public Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    public void start(){
        engine.start();
    }
}
