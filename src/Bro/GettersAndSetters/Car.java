package Bro.GettersAndSetters;

public class Car extends Vehicle {

    public Car(String model, String colour, int price) {
        super(model, colour, price);
    }

    public void setModel(String model) {
        super.setModel(model);
    }

    String getModel() {
        return super.getModel();
    }

    public void setColour(String colour) {
        super.setColour(colour);
    }

    String getColour() {
        return super.getColour();
    }

    public void setPrice(int price) {
        super.setPrice(price);
    }

    int getPrice() {
        return  super.getPrice();
    }

}
