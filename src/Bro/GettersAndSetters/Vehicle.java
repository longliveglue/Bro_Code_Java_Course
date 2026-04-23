package Bro.GettersAndSetters;

public class Vehicle {
    private String model;
    private String colour;
    private int price;

    public Vehicle(String model, String colour, int price){
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return this.model;
    }

    void setColour(String colour){
        this.colour = colour;
    }
    String getColour(){
        return this.colour;
    }

    void setPrice(int price){
        this.price = price;
    }
    int getPrice(){
        return this.price;
    }

}
